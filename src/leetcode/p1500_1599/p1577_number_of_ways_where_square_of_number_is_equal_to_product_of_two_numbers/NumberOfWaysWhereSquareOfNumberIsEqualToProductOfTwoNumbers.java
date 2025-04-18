package leetcode.p1500_1599.p1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers;

public interface NumberOfWaysWhereSquareOfNumberIsEqualToProductOfTwoNumbers {
	/**
	 * Given two arrays of integers nums1 and nums2, return the number
	 * of triplets formed (type 1 and type 2) under the following rules:
	 * <p>
	 * - Type 1: Triplet (i, j, k) if nums1[i]^2 == nums2[j] * nums2[k]
	 *   where 0 <= i < nums1.length and 0 <= j < k < nums2.length.
	 * - Type 2: Triplet (i, j, k) if nums2[i]^2 == nums1[j] * nums1[k]
	 *   where 0 <= i < nums2.length and 0 <= j < k < nums1.length.
	 * 
	 * @param nums1,num2 1 <= nums1.length, nums2.length <= 1000
	 *                   1 <= nums1[i], nums2[i] <= 10^5
	 */
	int numTriplets(int[] nums1, int[] nums2);
}
