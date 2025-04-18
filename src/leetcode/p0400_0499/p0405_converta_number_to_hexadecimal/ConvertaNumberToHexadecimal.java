package leetcode.p0400_0499.p0405_converta_number_to_hexadecimal;

public interface ConvertaNumberToHexadecimal {
    /**
     * Given an integer num, return a string representing its
     * hexadecimal representation. For negative integers, two's
     * complement method is used.
     * All the letters in the answer string should be lowercase
     * characters, and there should not be any leading zeros in the
     * answer except for the zero itself.
     * Note: You are not allowed to use any built-in library method to
     * directly solve this problem.
     *
     * @param num -2^31 <= num <= 2^31 - 1
     * @return integer to hexadecimal string.
     */
    String toHex(int num);
}
