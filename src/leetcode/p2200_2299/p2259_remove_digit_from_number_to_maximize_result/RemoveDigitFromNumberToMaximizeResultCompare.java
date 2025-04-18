package leetcode.p2200_2299.p2259_remove_digit_from_number_to_maximize_result;

public class RemoveDigitFromNumberToMaximizeResultCompare
        implements RemoveDigitFromNumberToMaximizeResult {
    @Override
    public String removeDigit(String number, char digit) {
        int len = number.length();
        char[] output = new char[len - 1];
        char[] chars = number.toCharArray();
        int lastIndex = -1;
        for (int i = 0; i < len - 1; i++) {
            if (chars[i] == digit) {
                if (chars[i + 1] > chars[i]) {
                    System.arraycopy(chars, i + 1,
                            output, i, len - i - 1);
                    return new String(output);
                } else {
                    lastIndex = i;
                    output[i] = chars[i];
                }
            } else {
                output[i] = chars[i];
            }
        }
        if (lastIndex != -1 && chars[len - 1] != digit) {
            System.arraycopy(chars, lastIndex + 1,
                    output, lastIndex, len - 1 - lastIndex);
        }
        return new String(output);
    }
}
