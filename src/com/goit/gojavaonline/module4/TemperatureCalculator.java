package com.goit.gojavaonline.module4;

public class TemperatureCalculator {

    //magic numbers were extracted to the constants

    public static final double toCelsiusDegreesKoeff1 = (5.0/9);
    public static final double toCelsiusDegreesKoeff2 = 32.0;

    public static final double toFahrenheitDegreesKoeff1 = (9.0/5);
    public static final double toFahrenheitDegreesKoeff2 = 32.0;

    public static double fahrenheitToCelsiusConverter(double fahrenheitDegrees){
        return toCelsiusDegreesKoeff1 * (fahrenheitDegrees - toCelsiusDegreesKoeff2);
    }

    public static double celsiusToFahrenheitConverter(double celsiusDegrees){
        return toFahrenheitDegreesKoeff1 * celsiusDegrees + toFahrenheitDegreesKoeff2;
    }
}
