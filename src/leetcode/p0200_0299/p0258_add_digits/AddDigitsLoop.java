package leetcode.p0200_0299.p0258_add_digits;

public class AddDigitsLoop implements AddDigits {
    @Override
    public int addDigits(int num) {
        while (num > 9) {
            num = addDigit(num);
        }
        return num;
    }

    private int addDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
}
