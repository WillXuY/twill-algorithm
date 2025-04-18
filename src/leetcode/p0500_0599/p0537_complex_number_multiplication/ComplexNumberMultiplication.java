package leetcode.p0500_0599.p0537_complex_number_multiplication;

public interface ComplexNumberMultiplication {
    /**
     * A complex number can be represented as a string on the form
     * "real+imaginaryi" where:
     * <p>
     * - real is the real part and is an integer in the range [-100, 100].
     * - imaginary is the imaginary part and is an integer in the range
     *   [-100, 100].
     * - i^2 == -1.
     * <p>
     * Given two complex numbers num1 and num2 as strings, return a
     * string of the complex number that represents their multiplications.
     *
     * @param num1,num2 are valid complex numbers.
     */
    String complexNumberMultiply(String num1, String num2);
}
