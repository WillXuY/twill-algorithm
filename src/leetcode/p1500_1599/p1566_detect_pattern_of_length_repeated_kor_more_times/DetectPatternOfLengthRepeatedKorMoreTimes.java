package leetcode.p1500_1599.p1566_detect_pattern_of_length_repeated_kor_more_times;

public interface DetectPatternOfLengthRepeatedKorMoreTimes {
    /**
     * Given an array of positive integers arr, find a pattern of length
     * m that is repeated k or more times.
     *
     * A pattern is a subarray (consecutive sub-sequence) that consists
     * of one or more values, repeated multiple times consecutively
     * without overlapping. A pattern is defined by its length and the
     * number of repetitions.
     *
     * Return true if there exists a pattern of length m that is
     * repeated k or more times, otherwise return false.
     *
     * @param arr 2 <= arr.length <= 100
     *            1 <= arr[i] <= 100
     * @param m 1 <= m <= 100
     * @param k 2 <= k <= 100
     */
    boolean containsPattern(int[] arr, int m, int k);
}
