package leetcode.p1200_1299.p1287_element_appearing_more_than25p_in_sorted_array;

public class ElementAppearingMoreThan25pInSortedArrayCount
        implements ElementAppearingMoreThan25pInSortedArray {
    @Override
    public int findSpecialInteger(int[] arr) {
        int last = -1;
        int count = 0;
        for (int i: arr) {
            if (i == last) {
                count++;

            } else {
                last = i;
                count = 1;
            }
            if (count * 4 > arr.length) {
                return i;
            }
        }
        return -1;
    }
}
