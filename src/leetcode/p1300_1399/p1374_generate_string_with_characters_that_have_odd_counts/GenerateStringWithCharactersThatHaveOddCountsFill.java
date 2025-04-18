package leetcode.p1300_1399.p1374_generate_string_with_characters_that_have_odd_counts;

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
