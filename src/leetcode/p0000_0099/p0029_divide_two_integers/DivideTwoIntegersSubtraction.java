package leetcode.p0000_0099.p0029_divide_two_integers;

public class DivideTwoIntegersSubtraction implements DivideTwoIntegers {
    @Override
    public int divide(int dividend, int divisor) {
        if (dividend == 0 || divisor == 0) {
            return 0;
        } else if (divisor == 1) {
            return dividend;
        } else if (divisor == 2) {
            return dividend >> 1;
        }
        long output = 0;
        boolean isPositive = false;
        if (dividend > 0 && divisor > 0) {
            isPositive = true;
        } else if (dividend < 0 && divisor < 0) {
            isPositive = true;
        }
        long dend = dividend;
        long sor = divisor;
        dend = Math.abs(dend);
        sor = Math.abs(sor);
        while (output <= Integer.MAX_VALUE) {
            if (dend >= sor) {
                dend -= sor;
                output++;
                if (isPositive && output == Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                } else if (!isPositive && -output == Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
            } else {
                break;
            }
        }
        if (!isPositive) {
            output *= -1;
        }
        if (output > Integer.MAX_VALUE) {
            output = Integer.MAX_VALUE;
        }
        return (int)output;
    }
}
