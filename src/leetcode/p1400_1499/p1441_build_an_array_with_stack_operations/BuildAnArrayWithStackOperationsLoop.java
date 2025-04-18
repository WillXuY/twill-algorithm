package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.BuildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperationsLoop
        implements BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> output = new ArrayList<>();
        int iteration = 1;
        for (int i: target) {
            if (iteration == i) {
                output.add("Push");
                iteration++;
            } else if (iteration < i) {
                while (iteration < i) {
                    output.add("Push");
                    output.add("Pop");
                    iteration++;
                }
                output.add("Push");
                iteration++;
            }
        }
        return output;
    }
}
