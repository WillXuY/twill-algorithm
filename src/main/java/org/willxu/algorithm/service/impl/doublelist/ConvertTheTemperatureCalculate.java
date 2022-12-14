package org.willxu.algorithm.service.impl.doublelist;

import org.willxu.algorithm.service.doublelist.ConvertTheTemperature;

public class ConvertTheTemperatureCalculate implements ConvertTheTemperature {
    @Override
    public double[] convertTemperature(double celsius) {
        return new double[] {celsius + 273.15, celsius * 1.8 + 32};
    }
}
