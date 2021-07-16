public class Temperature {

    enum TempScale {
        FAHRENHEIT,
        CELSIUS,
        KELVIN
    }

    private double degrees;
    private TempScale scale;

    public Temperature(double degrees, TempScale scale) {
        this.degrees = degrees;
        this.scale = scale;
    }

    public double getDegrees() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public TempScale getScale() {
        return scale;
    }

    public void setScale(TempScale scale) {
        this.scale = scale;
    }

    public double toCelsius() {
        double conversion = 0;
        switch (this.scale) {
            case CELSIUS:
                conversion = this.degrees;
                break;
            case FAHRENHEIT:
                conversion = ((this.degrees - 32) * .5555555555);
                break;
            case KELVIN:
                conversion = this.degrees - 273.15;
                break;
        }
        return conversion;
    }

    @Override
    public String toString() {
        return this.degrees + " degrees " + this.scale;
    }
}
