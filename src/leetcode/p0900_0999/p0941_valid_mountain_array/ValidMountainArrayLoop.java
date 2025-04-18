package leetcode.p0900_0999.p0941_valid_mountain_array;

public class ValidMountainArrayLoop implements ValidMountainArray {
    /**
     * 1. Determine the array start to increase.
     * 2. Then determine the array decrease to end.
     * 3. If two element are same, return false.
     *
     * @param arr 1 <= arr.length <= 10^4
     *            0 <= arr[i] <= 10^4
     * @return is mountain array.
     */
    @Override
    public boolean validMountainArray(int[] arr) {
        boolean increased = false;
        boolean decreasing = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                if (decreasing) {
                    return false;
                }
                increased = true;
            } else if (arr[i] < arr[i - 1]) {
                if (!increased) {
                    return false;
                }
                decreasing = true;
            } else {
                return false;
            }
        }
        return decreasing;
    }
}
