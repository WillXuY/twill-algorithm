package leetcode.p0000_0099.p0008_string_to_integer_atoi;

public interface StringToIntegerAtoi {
    /**
     * Implement the myAtoi(string s) function, which converts a string
     * to a 32-bit signed integer (similar to C/C++'s atoi function).
     * <p>
     * The algorithm for myAtoi(string s) is as follows:
     * <p>
     * Read in and ignore any leading whitespace.
     * Check if the next character (if not already at the end of the
     * string) is '-' or '+'. Read this character in if it is either.
     * This determines if the final result is negative or positive
     * respectively. Assume the result is positive if neither is
     * present.
     * Read in next the characters until the next non-digit character or
     * the end of the input is reached. The rest of the string is
     * ignored.
     * Convert these digits into an integer (i.e. "123" -> 123,
     * "0032" -> 32). If no digits were read, then the integer is 0.
     * Change the sign as necessary (from step 2).
     * If the integer is out of the 32-bit signed integer range
     * [-2^31, 2^31 - 1], then clamp the integer so that it remains in
     * the range. Specifically, integers less than -2^31 should be
     * clamped to -2^31, and integers greater than 2^31 - 1 should be
     * clamped to 2^31 - 1.
     * Return the integer as the final result.
     * <p>
     * Note:
     * <p>
     * - Only the space character ' ' is considered a whitespace
     *   character.
     * - Do not ignore any characters other than the leading whitespace
     *   or the rest of the string after the digits.
     *
     * @param s 0 <= s.length <= 200
     *          consists of English letters (lower-case and upper-case),
     *          digits (0-9), ' ', '+', '-', and '.'.
     */
    int myAtoi(String s);
}
