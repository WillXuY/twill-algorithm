package leetcode.p2200_2299.p2243_calculate_digit_sum_of_string;

public class CalculateDigitSumOfStringLoop
        implements CalculateDigitSumOfString {
    @Override
    public String digitSum(String s, int k) {
        StringBuilder output = new StringBuilder();
        output.append(s);
        while (output.length() > k) {
            output = digitSumLoop(output.toString(), k);
        }
        return output.toString();
    }

    public StringBuilder digitSumLoop(String s, int k) {
        char[] chars = s.toCharArray();
        StringBuilder output = new StringBuilder();
        int groupSum = chars[0] - '0';
        for (int i = 1; i < chars.length; i++) {
            if (i % k == 0) {
                output.append(groupSum);
                groupSum = 0;
            }
            groupSum += chars[i] - '0';
        }
        output.append(groupSum);
        return output;
    }
}
