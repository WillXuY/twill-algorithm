package leetcode.p0000_0099.p0043_multiply_strings;

import java.util.ArrayList;
import java.util.List;

public class MultiplyStringsLoop implements MultiplyStrings {
    @Override
    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        List<String> reverseMultiply = new ArrayList<>();
        char[] chars2 = num2.toCharArray();
        for (int i = num2.length() - 1; i >= 0; i--) {
            reverseMultiply.add(reverseMultiply(num1, chars2[i]));
        }
        int maxLength = num1.length() + num2.length();
        int add = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int sum = 0;
            for (int j = 0; j <= i && j < reverseMultiply.size(); j++) {
                int index = i - j;
                if (index < 0) {
                    continue;
                }
                String num = reverseMultiply.get(j);
                if (index >= num.length()) {
                    continue;
                }
                sum += num.toCharArray()[index] - '0';
            }
            sum += add;
            add = sum / 10;
            sb.append(sum % 10);
        }
        String output = sb.reverse().toString();
        return output.replaceAll("^0*", "");
    }

    private String reverseMultiply(String num, char c) {
        int m = c - '0';
        int remain = 0;
        StringBuilder result = new StringBuilder();
        char[] chars = num.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            int n = chars[i] - '0';
            int sum = n * m + remain;
            remain = sum / 10;
            result.append(sum % 10);
        }
        if (remain > 0) {
            result.append(remain);
        }
        return result.toString();
    }
}
