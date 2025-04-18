package leetcode.p1500_1599.p1502_can_make_arithmetic_progression_from_sequence;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequenceSort
        implements CanMakeArithmeticProgressionFromSequence {
    @Override
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (diff != arr[i] - arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
