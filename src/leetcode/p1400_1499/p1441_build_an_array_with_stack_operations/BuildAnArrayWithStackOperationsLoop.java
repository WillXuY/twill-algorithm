package leetcode.p1400_1499.p1441_build_an_array_with_stack_operations;

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
