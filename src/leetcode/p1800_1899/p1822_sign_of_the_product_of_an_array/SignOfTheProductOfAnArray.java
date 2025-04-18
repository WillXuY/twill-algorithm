package leetcode.p1800_1899.p1822_sign_of_the_product_of_an_array;

public interface SignOfTheProductOfAnArray {
    /**
     * There is a function signFunc(x) that returns:
     *
     * - 1 if x is positive.
     * - -1 if x is negative.
     * - 0 if x is equal to 0.
     *
     * You are given an integer array nums. Let product be the product
     * of all values in the array nums.
     *
     * Return signFunc(product).
     *
     * @param nums 1 <= nums.length <= 1000
     *             -100 <= nums[i] <= 100
     */
    int arraySign(int[] nums);
}
