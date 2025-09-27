public class KilometerToFeetAdapter implements DistanceConverter {
    private final KilometerConverter converter = new KilometerConverter();

    @Override
    public double convert(double kilometers) {
        return converter.convertToFeet(kilometers);
    }

    @Override
    public String getUnitName() {
        return "feet";
    }
}