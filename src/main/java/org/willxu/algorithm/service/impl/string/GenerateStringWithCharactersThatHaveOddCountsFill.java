package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.GenerateStringWithCharactersThatHaveOddCounts;

import java.util.Arrays;

public class GenerateStringWithCharactersThatHaveOddCountsFill
        implements GenerateStringWithCharactersThatHaveOddCounts {
    @Override
    public String generateTheString(int n) {
        char[] output = new char[n];
        Arrays.fill(output, 'a');
        if ((n & 1) == 0) {
            output[0] = 'b';
        }
        return new String(output);
    }
}
