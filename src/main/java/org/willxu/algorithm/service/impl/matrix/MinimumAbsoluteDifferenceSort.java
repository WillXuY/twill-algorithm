package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.MinimumAbsoluteDifference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinimumAbsoluteDifferenceSort
        implements MinimumAbsoluteDifference {
    @Override
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (minAbs > diff) {
                output.clear();
                output.add(Stream.of(arr[i - 1], arr[i])
                        .collect(Collectors.toList()));
                minAbs = diff;
            } else if (minAbs == diff) {
                output.add(Stream.of(arr[i - 1], arr[i])
                        .collect(Collectors.toList()));
            }
        }
        return output;
    }
}
