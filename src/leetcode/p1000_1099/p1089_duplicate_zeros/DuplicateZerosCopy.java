package leetcode.p1000_1099.p1089_duplicate_zeros;

public class DuplicateZerosCopy implements DuplicateZeros {
    @Override
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.arraycopy(arr, i, arr, i + 1,
                        arr.length - 1 - i);
                i++;
            }
        }
    }
}
