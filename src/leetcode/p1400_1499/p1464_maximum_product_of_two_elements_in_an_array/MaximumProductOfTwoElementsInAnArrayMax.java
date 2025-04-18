package leetcode.p1400_1499.p1464_maximum_product_of_two_elements_in_an_array;

public class MaximumProductOfTwoElementsInAnArrayMax
        implements MaximumProductOfTwoElementsInAnArray {
    @Override
    public int maxProduct(int[] nums) {
        int max = 0, second = 0;
        for (int n: nums) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n == max) {
                second = n;
            } else if (n > second) {
                second = n;
            }
        }
        return (max - 1) * (second - 1);
    }
}
