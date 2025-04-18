package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.DiStringMatch;

public class DiStringMatchLoop implements DiStringMatch {
    /**
     * 1. Init the array of all elements = 0, size = s.length + 1.
     * 2. Save the count D - count I, and the index of output.
     * 3. Loop the s count D-I and save count increasing order.
     * 4. Write the index of countD-I in output's value.
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either 'I' or 'D'.
     * @return array match di string.
     */
    @Override
    public int[] diStringMatch(String s) {
        char[] chars = s.toCharArray();
        int countDi = 0;
        int[] countDiOrder = new int[chars.length + 1];
        int[] outputIndexOrder = new int[chars.length + 1];
        for (int i = 0; i < chars.length; i++) {
            if ('I' == chars[i]) {
                countDi--;
            } else if ('D' == chars[i]) {
                countDi++;
            }
            for (int j = 0; j <= i + 1; j++) {
                if (countDi > countDiOrder[j]) {
                    System.arraycopy(countDiOrder, j,
                            countDiOrder, j + 1, i + 1 - j);
                    System.arraycopy(outputIndexOrder, j,
                            outputIndexOrder, j + 1, i + 1 - j);
                    countDiOrder[j] = countDi;
                    outputIndexOrder[j] = i + 1;
                    break;
                } else if (j == i + 1) {
                    countDiOrder[j] = countDi;
                    outputIndexOrder[j] = i + 1;
                }
            }
        }
        int[] output = new int[chars.length + 1];
        for (int i = 0; i < outputIndexOrder.length; i++) {
            output[outputIndexOrder[i]] = i;
        }
        return output;
    }
}
