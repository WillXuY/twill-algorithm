package leetcode.p2200_2299.p2283_check_if_number_has_equal_digit_count_and_digit_value;

public class CheckIfNumberHasEqualDigitCountAndDigitValueCount
        implements CheckIfNumberHasEqualDigitCountAndDigitValue {
    @Override
    public boolean digitCount(String num) {
        int[] count = new int[10];
        char[] chars = num.toCharArray();
        for (char c: chars) {
            count[c - '0']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (count[i] != chars[i] - '0') {
                return false;
            }
        }
        return true;
    }
}
