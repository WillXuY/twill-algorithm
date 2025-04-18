package leetcode.p1600_1699.p1668_maximum_repeating_substring;

public class MaximumRepeatingSubstringLoop implements MaximumRepeatingSubstring {
    @Override
    public int maxRepeating(String sequence, String word) {
        int output = 0;
        char[] wordChars = word.toCharArray();
        char[] chars = sequence.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int length = 0;
            for (int j = 0; j < chars.length - i; j++) {
                int wordIndex = j % wordChars.length;
                if (chars[i + j] != wordChars[wordIndex]) {
                    length = j / wordChars.length;
                    break;
                } else if (i + j >= chars.length - 1) {
                    length = (j + 1) / wordChars.length;
                }
            }
            if (length > output) {
                output = length;
            }
        }
        return output;
    }
}
