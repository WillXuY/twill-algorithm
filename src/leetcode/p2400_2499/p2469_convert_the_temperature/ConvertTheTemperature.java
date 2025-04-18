package leetcode.p2400_2499.p2469_convert_the_temperature;

public interface ConvertTheTemperature {
    /**
     * You are given a non-negative floating point number rounded to
     * two decimal places celsius, that denotes the temperature in
     * Celsius.
     * <p>
     * You should convert Celsius into Kelvin and Fahrenheit and return
     * it as an array ans = [kelvin, fahrenheit].
     * <p>
     * Return the array ans. Answers within 10-5 of the actual answer
     * will be accepted.
     * <p>
     * Note that:
     * <p>
     * - Kelvin = Celsius + 273.15
     * - Fahrenheit = Celsius * 1.80 + 32.00
     *
     * @param celsius 0 <= celsius <= 1000
     */
    double[] convertTemperature(double celsius);
}
