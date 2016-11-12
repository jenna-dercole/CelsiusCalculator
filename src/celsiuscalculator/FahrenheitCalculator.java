
package celsiuscalculator;

/**
 *
 * @author Jenna
 */
public class FahrenheitCalculator implements TemperatureCalculationStrategy {
    private double fahrenheitTemp;
    private TemperatureCalculationStrategy tcs;

    public final double getFahrenheitTemp() {
        return fahrenheitTemp;
    }

    public final void setFahrenheitTemp(double fahrenheitTemp) {
        this.fahrenheitTemp = fahrenheitTemp;
    }
    
    @Override
    public final double calculateTemp(double celsiusTemp) {
        fahrenheitTemp = celsiusTemp * 1.8 + 32;
        return fahrenheitTemp;
    }
    
    
}
