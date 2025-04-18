package leetcode.p1300_1399.p1385_find_the_distance_value_between_two_arrays;

public class FindTheDistanceValueBetweenTwoArraysLoop
        implements FindTheDistanceValueBetweenTwoArrays {
    @Override
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int output = 0;
        for (int i: arr1) {
            boolean distanceValue = true;
            for (int j: arr2) {
                if (Math.abs(i - j) <= d) {
                    distanceValue = false;
                    break;
                }
            }
            if (distanceValue) {
                output++;
            }
        }
        return output;
    }
}
