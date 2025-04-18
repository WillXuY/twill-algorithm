package leetcode.p1000_1099.p1009_complement_of_base10_integer;

public interface ComplementOfBase10Integer {
    /**
     * The complement of an integer is the integer you get when you flip
     * all the 0's to 1's and all the 1's to 0's in its binary
     * representation.
     * - For example, The integer 5 is "101" in binary and its
     *   complement is "010" which is the integer 2.
     * Given an integer n, return its complement.
     *
     * @param n 0 <= n < 10^9
     * @return bit wise complement of n.
     */
    int bitwiseComplement(int n);
}
