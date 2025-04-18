package leetcode.p1200_1299.p1299_replace_elements_with_greatest_element_on_right_side;

public class ReplaceElementsWithGreatestElementOnRightSideLoop
        implements ReplaceElementsWithGreatestElementOnRightSide {
    @Override
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int arrI = arr[i];
            arr[i] = max;
            max = Math.max(max, arrI);
        }
        return arr;
    }
}
