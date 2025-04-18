package leetcode.p1800_1899.p1822_sign_of_the_product_of_an_array;

public class SignOfTheProductOfAnArrayLoop
        implements SignOfTheProductOfAnArray {
    @Override
    public int arraySign(int[] nums) {
        int output = 1;
        for (int n: nums) {
            if (n == 0) {
                return 0;
            } else if (n < 0) {
                output *= -1;
            }
        }
        return output;
    }
}
