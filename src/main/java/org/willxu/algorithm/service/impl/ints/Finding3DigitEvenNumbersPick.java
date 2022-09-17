package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.Finding3DigitEvenNumbers;

import java.util.TreeSet;

public class Finding3DigitEvenNumbersPick implements Finding3DigitEvenNumbers {
    @Override
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> output = new TreeSet<>();
        for (int i = 0; i < digits.length; i++) {
            int ni = digits[i];
            if ((ni & 1) == 1) {
                continue;
            }
            for (int j = 0; j < digits.length; j++) {
                if (i == j) {
                    continue;
                }
                int nj = digits[j];
                for (int k = 0; k < digits.length; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    int nk = digits[k];
                    if (nk != 0) {
                        output.add(100 * nk + 10 * nj + ni);
                    }
                    if (nj != 0) {
                        output.add(100 * nj + 10 * nk + ni);
                    }
                }
            }
        }
        if (output.size() == 0) {
            return new int[] {};
        }
        int[] out = new int[output.size()];
        int i = 0;
        for (int o: output) {
            out[i] = o;
            i++;
        }
        return out;
    }
}
