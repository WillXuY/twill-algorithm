package leetcode.p2400_2499.p2496_maximum_value_of_string_in_an_array;

public class MaximumValueOfStringInAnArrayParse
        implements MaximumValueOfStringInAnArray {
    @Override
    public int maximumValue(String[] strs) {
        int output = -1;
        for (String s: strs) {
            int num;
            try {
                num = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                num = s.length();
            }
            if (num > output) {
                output = num;
            }
        }
        return output;
    }
}
