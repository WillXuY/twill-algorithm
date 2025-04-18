package leetcode.p0200_0299.p0263_ugly_number;

public class UglyNumberDivide implements UglyNumber {
    @Override
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        n = divideAllFactor(n, 2);
        n = divideAllFactor(n, 3);
        n = divideAllFactor(n, 5);
        return n == 1;
    }

    private int divideAllFactor(int n, int factor) {
        while (n % factor == 0) {
            n /= factor;
        }
        return n;
    }
}
