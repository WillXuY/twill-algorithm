package leetcode.p1000_1099.p1009_complement_of_base10_integer;

public class ComplementOfBase10IntegerBit implements ComplementOfBase10Integer {
    /**
     * 5: 101 -> 2 : 010
     * 5%2 = 1 -> 0 * 2^0
     * 5 = 5 / 2
     *
     * @param n 0 <= n < 10^9
     * @return replace all the 1 to 0, 0 to 1 in 5's bitwise complement.
     */
    @Override
    public int bitwiseComplement(int n) {
        if (n == 0) {
            return 1;
        }
        int output = 0;
        int bit = 1;
        while (n > 0) {
            output += (n & 1 ^ 1) * bit;
            bit *= 2;
            n = n / 2;
        }
        return output;
    }
}
