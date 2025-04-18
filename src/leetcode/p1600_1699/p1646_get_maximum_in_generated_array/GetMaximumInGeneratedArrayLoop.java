package leetcode.p1600_1699.p1646_get_maximum_in_generated_array;

public class GetMaximumInGeneratedArrayLoop
        implements GetMaximumInGeneratedArray {
    @Override
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int output = 0;
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            if ((i & 1) == 0) {
                array[i] = array[i / 2];
            } else {
                array[i] = array[i / 2] + array[i / 2 + 1];
            }
            if (array[i] > output) {
                output = array[i];
            }
        }
        return output;
    }
}
