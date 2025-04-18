package leetcode.p1600_1699.p1619_mean_of_array_after_removing_some_elements;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElementsSort
        implements MeanOfArrayAfterRemovingSomeElements {
    @Override
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int removeLength = arr.length / 20;
        int count = 0;
        for (int i = removeLength; i < arr.length - removeLength; i++) {
            count += arr[i];
        }
        return ((double) count) / (arr.length - 2 * removeLength);
    }
}
