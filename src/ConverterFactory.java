public class ConverterFactory {
    public static DistanceConverter getConverter(int choice) {
        return switch (choice) {
            case 1 -> new KilometerToMileAdapter();
            case 2 -> new KilometerToFeetAdapter();
            case 3 -> new KilometerToYardAdapter();
            default -> null;
        };
    }
}
