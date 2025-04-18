package leetcode.p0400_0499.p0415_add_strings;

public interface AddStrings {
    /**
     * Given two non-negative integers, num1 and num2 represented as
     * string, return the sum of num1 and num2 as a string.
     * You must not solve the problem without using any built-in library
     * for handling large integers (such as BigInteger). You must also
     * not convert the inputs to integers directly.
     *
     * @param num1 1 <= num1.length <= 10^4
     *             consist of only digits.
     *             don't have any leading zeros except for zero itself.
     * @param num2 1 <= num1.length <= 10^4
     *             consist of only digits.
     *             don't have any leading zeros except for zero itself.
     * @return the sum of two string numbers.
     */
    String addStrings(String num1, String num2);
}
