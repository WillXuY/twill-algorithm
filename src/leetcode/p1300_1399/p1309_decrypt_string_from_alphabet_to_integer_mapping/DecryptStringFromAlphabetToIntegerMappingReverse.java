package leetcode.p1300_1399.p1309_decrypt_string_from_alphabet_to_integer_mapping;

public class DecryptStringFromAlphabetToIntegerMappingReverse
        implements DecryptStringFromAlphabetToIntegerMapping {
    @Override
    public String freqAlphabets(String s) {
        StringBuilder reverseOutput = new StringBuilder();
        char[] chars = s.toCharArray();
        boolean isLargeNumber = false;
        int lastInt = -1;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '#') {
                isLargeNumber = true;
            } else if (isLargeNumber) {
                if (lastInt == -1) {
                    lastInt = chars[i];
                } else {
                    char c = (char) ((chars[i] - 48) * 10 + lastInt + 48);
                    reverseOutput.append(c);
                    lastInt = -1;
                    isLargeNumber = false;
                }
            } else {
                char c = (char) (chars[i] + 48);
                reverseOutput.append(c);
            }
        }
        return reverseOutput.reverse().toString();
    }
}
