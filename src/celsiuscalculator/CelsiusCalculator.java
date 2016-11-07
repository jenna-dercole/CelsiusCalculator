
package celsiuscalculator;

/**
 *
 * @author Jenna
 */
public class CelsiusCalculator {
    private double celsiusTemp;
    private double fahrenheitTemp;

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
    
    public final double calculateCelsius(double fahrenheit) {
        celsiusTemp = (fahrenheit - 32) * 5 / 9;
        return celsiusTemp;
    }
   
}
