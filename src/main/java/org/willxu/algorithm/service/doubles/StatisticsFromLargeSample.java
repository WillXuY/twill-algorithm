package org.willxu.algorithm.service.doubles;

public interface StatisticsFromLargeSample {
    /**
     * You are given a large sample of integers in the range [0, 255].
     * Since the sample is so large, it is represented by an array count
     * where count[k] is the number of times that k appears in the
     * sample.
     * <p>
     * Calculate the following statistics:
     * <p>
     * - minimum: The minimum element in the sample.
     * - maximum: The maximum element in the sample.
     * - mean: The average of the sample, calculated as the total sum of
     *   all elements divided by the total number of elements.
     * - median:
     *   - If the sample has an odd number of elements, then the median
     *     is the middle element once the sample is sorted.
     *   - If the sample has an even number of elements, then the median
     *     is the average of the two middle elements once the sample is
     *     sorted.
     * - mode: The number that appears the most in the sample. It is
     *   guaranteed to be unique.
     * <p>
     * Return the statistics of the sample as an array of floating-point
     * numbers [minimum, maximum, mean, median, mode]. Answers within
     * 10-5 of the actual answer will be accepted.
     *
     * @param count count.length == 256
     *              0 <= count[i] <= 10^9
     *              1 <= sum(count) <= 10^9
     *              The mode of the sample that count represents is
     *              unique.
     */
    double[] sampleStats(int[] count);
}
