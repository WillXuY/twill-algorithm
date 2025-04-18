package leetcode.p0400_0499.p0476_number_complement;

public interface NumberComplement {
    /**
     * The complement of an integer is the integer you get when you flip
     * all the 0's to 1's and all the 1's to 0's in its binary
     * representation.
     * - For example, The integer 5 is "101" in binary and its
     *   complement is "010" which is the integer 2.
     *
     * @param num 1 <= num <= 2^31
     * @return the complement.
     */
    int findComplement(int num);
}
