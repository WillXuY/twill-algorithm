package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfCommonFactors;

public class NumberOfCommonFactorsLoop implements NumberOfCommonFactors {
    @Override
    public int commonFactors(int a, int b) {
        int max = a, min = b;
        if (a < b) {
            max = b;
            min = a;
        }
        int output = 0;
        for (int i = 1; i <= min; i++) {
            if (min % i == 0 && max % i == 0) {
                output++;
            }
        }
        return output;
    }
}
