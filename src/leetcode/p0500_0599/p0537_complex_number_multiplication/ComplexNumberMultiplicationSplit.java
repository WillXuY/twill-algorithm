package leetcode.p0500_0599.p0537_complex_number_multiplication;

public class ComplexNumberMultiplicationSplit
        implements ComplexNumberMultiplication {
    @Override
    public String complexNumberMultiply(String num1, String num2) {
        String[] numStr1 = num1.split("\\+");
        int real1 = Integer.parseInt(numStr1[0]);
        numStr1[1] = numStr1[1].substring(0, numStr1[1].length() - 1);
        int imag1 = Integer.parseInt(numStr1[1]);
        String[] numStr2 = num2.split("\\+");
        int real2 = Integer.parseInt(numStr2[0]);
        numStr2[1] = numStr2[1].substring(0, numStr2[1].length() - 1);
        int imag2 = Integer.parseInt(numStr2[1]);
        int realOut = real1 * real2 - (imag1 * imag2);
        int imagOut = real1 * imag2 + real2 * imag1;
        return realOut + "+" + imagOut + "i";
    }
}
