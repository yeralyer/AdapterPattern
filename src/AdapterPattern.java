import java.util.Scanner;

public class AdapterPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Distance Converter ");
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        System.out.println("Choose unit to convert to:");
        System.out.println("1:Miles");
        System.out.println("2:Feet");
        System.out.println("3:Yards");
        int choice = scanner.nextInt();

        DistanceConverter converter;
        switch (choice) {
            case 1 -> converter = new KilometerToMileAdapter();
            case 2 -> converter = new KilometerToFeetAdapter();
            case 3 -> converter = new KilometerToYardAdapter();
            default -> {
                System.out.println("Error:");
                return;
            }
        }

        double result = converter.convert(kilometers);
        System.out.printf("%.2f km = %.2f%s", kilometers, result, converter.getUnitName());
        scanner.close();
    }
}
