package leetcode.p0400_0499.p0405_converta_number_to_hexadecimal;

public class ConvertaNumberToHexadecimalRemainder
        implements ConvertaNumberToHexadecimal {
    @Override
    public String toHex(int num) {
        StringBuilder result = new StringBuilder();
        char[] chars = new char[] {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f'};
        boolean negative = false;
        if (num == 0) {
            return "0";
        } else if (num < 0) {
            negative = true;
            num = -num - 1;
        }
        while (num > 0) {
            int remainder = num % 16;
            if (negative) {
                result.append(chars[15 - remainder]);
            } else {
                result.append(chars[remainder]);
            }
            num /= 16;
        }
        if (negative) {
            result.append("f".repeat(Math.max(0, 8 - result.length())));
        }
        return result.reverse().toString();
    }
}
