package leetcode.p1300_1399.p1313_decompress_run_length_encoded_list;

import java.util.ArrayList;
import java.util.List;

public class DecompressRunLengthEncodedListLoop
        implements DecompressRunLengthEncodedList {
    @Override
    public int[] decompressRLElist(int[] nums) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                output.add(nums[i + 1]);
            }
        }
        int[] o = new int[output.size()];
        for (int i = 0; i < o.length; i++) {
            o[i] = output.get(i);
        }
        return o;
    }
}
