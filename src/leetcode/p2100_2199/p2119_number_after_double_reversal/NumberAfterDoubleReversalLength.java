package leetcode.p2100_2199.p2119_number_after_double_reversal;

public class NumberAfterDoubleReversalLength
        implements NumberAfterDoubleReversal {
    @Override
    public boolean isSameAfterReversals(int num) {
        int len = 0;
        int lenZero = 0;
        boolean isZero = true;
        while (num > 0) {
            if (isZero) {
                if (num % 10 == 0) {
                    lenZero++;
                } else {
                    isZero = false;
                }
            }
            len++;
            num /= 10;
        }
        return lenZero == 0 || len == 1;
    }
}
