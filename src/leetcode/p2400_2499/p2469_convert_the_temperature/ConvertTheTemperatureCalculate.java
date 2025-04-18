package leetcode.p2400_2499.p2469_convert_the_temperature;

public class ConvertTheTemperatureCalculate implements ConvertTheTemperature {
    @Override
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.8 + 32};
    }
}
