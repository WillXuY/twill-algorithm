package leetcode.p0500_0599.p0504_base7;

public class Base7Division implements Base7 {
    @Override
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean negative = false;
        if (num < 0) {
            negative = true;
            num *= -1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            stringBuilder.insert(0, num % 7);
            num /= 7;
        }
        if (negative) {
            stringBuilder.insert(0, '-');
        }
        return stringBuilder.toString();
    }
}
