public class KilometerToMileAdapter implements DistanceConverter {
    private final KilometerConverter converter = new KilometerConverter();

    @Override
    public double convert(double kilometers) {
        return converter.convertToMiles(kilometers);
    }

    @Override
    public String getUnitName() {
        return "miles";
    }
}