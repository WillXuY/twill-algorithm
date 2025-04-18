package leetcode.p2200_2299.p2269_find_the_beauty_of_number;

public interface FindTheBeautyOfNumber {
    /**
     * The k-beauty of an integer num is defined as the number of
     * substrings of num when it is read as a string that meet the
     * following conditions:
     * <p>
     * - It has a length of k.
     * - It is a divisor of num.
     * <p>
     * Given integers num and k, return the k-beauty of num.
     * Note:
     * <p>
     * - Leading zeros are allowed.
     * - 0 is not a divisor of any value.
     * <p>
     * A substring is a contiguous sequence of characters in a string.
     *
     * @param num 1 <= num <= 109
     * @param k 1 <= k <= num.length (taking num as a string)
     */
    int divisorSubstrings(int num, int k);
}
