package leetcode.p1500_1599.p1502_can_make_arithmetic_progression_from_sequence;

public interface CanMakeArithmeticProgressionFromSequence {
    /**
     * A sequence of numbers is called an arithmetic progression if the
     * difference between any two consecutive elements is the same.
     *
     * Given an array of numbers arr, return true if the array can be
     * rearranged to form an arithmetic progression. Otherwise, return
     * false.
     *
     * @param arr 2 <= arr.length <= 1000
     *            -106 <= arr[i] <= 106
     */
    boolean canMakeArithmeticProgression(int[] arr);
}
