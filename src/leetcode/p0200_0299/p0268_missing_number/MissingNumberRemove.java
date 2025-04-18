package leetcode.p0200_0299.p0268_missing_number;

import java.util.TreeSet;

public class MissingNumberRemove implements MissingNumber {
    @Override
    public int missingNumber(int[] nums) {
        TreeSet<Integer> all = new TreeSet<>();
        for (int i = 0; i <= nums.length; i++) {
            all.add(i);
        }
        for (Integer n: nums) {
            all.remove(n);
        }
        if (!all.isEmpty()) {
            return all.first();
        }
        return 0;
    }
}
