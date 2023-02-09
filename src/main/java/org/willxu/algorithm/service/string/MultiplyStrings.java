package org.willxu.algorithm.service.string;

public interface MultiplyStrings {
    /**
     * Given two non-negative integers num1 and num2 represented as
     * strings, return the product of num1 and num2, also represented as
     * a string.
     * <p>
     * Note: You must not use any built-in BigInteger library or convert
     * the inputs to integer directly.
     *
     * @param num1,num2 1 <= num1.length, num2.length <= 200
     *                  num1 and num2 consist of digits only.
     *                  Both num1 and num2 do not contain any leading
     *                  zero, except the number 0 itself.
     */
    String multiply(String num1, String num2);
}
