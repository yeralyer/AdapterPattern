public class KilometerToYardAdapter implements DistanceConverter {
    private final KilometerConverter converter = new KilometerConverter();

    @Override
    public double convert(double kilometers) {
        return converter.convertToYards(kilometers);
    }

    @Override
    public String getUnitName() {
        return "yards";
    }
}