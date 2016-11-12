
package celsiuscalculator;

/**
 *
 * @author Jenna
 */
public class CelsiusCalculator implements TemperatureCalculationStrategy {
    private double celsiusTemp;
    private double fahrenheitTemp;
    private TemperatureCalculationStrategy tcs;

    public final double getFahrenheitTemp() {
        return fahrenheitTemp;
    }
    

    public final void setFahrenheitTemp(double fahrenheitTemp) throws NumberFormatException {
        this.fahrenheitTemp = fahrenheitTemp;
    }

    public final double getCelsiusTemp() {
        return celsiusTemp;
    }

    public final void setCelsiusTemp(double celsiusTemp) {
        this.celsiusTemp = celsiusTemp;
    }

    @Override
    public final double calculateTemp(double fahrenheit) {
        celsiusTemp = (fahrenheit - 32) * 5 / 9;
        return celsiusTemp;
    }
   
}
