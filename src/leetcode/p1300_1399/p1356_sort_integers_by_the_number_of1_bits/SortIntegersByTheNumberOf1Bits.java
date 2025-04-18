package leetcode.p1300_1399.p1356_sort_integers_by_the_number_of1_bits;

public interface SortIntegersByTheNumberOf1Bits {
    /**
     * You are given an integer array arr. Sort the integers in the
     * array in ascending order by the number of 1's in their binary
     * representation and in case of two or more integers have the same
     * number of 1's you have to sort them in ascending order.
     * Return the array after sorting it.
     *
     * @param arr 1 <= arr.length <= 500
     *            0 <= arr[i] <= 10^4
     * @return sort the number of 1's in arr[i]'s binary.
     */
    int[] sortByBits(int[] arr);
}
