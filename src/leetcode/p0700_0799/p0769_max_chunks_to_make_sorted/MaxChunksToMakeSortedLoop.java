package leetcode.p0700_0799.p0769_max_chunks_to_make_sorted;

public class MaxChunksToMakeSortedLoop implements MaxChunksToMakeSorted {
    @Override
    public int maxChunksToSorted(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (i < min) {
                min = i;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] -= min;
        }
        int count = 0;
        int junpIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            int sortedIndex = arr[i];
            if (junpIndex >= i) {
                if (sortedIndex > junpIndex) {
                    junpIndex = sortedIndex;
                }
                continue;
            }
            // not jump.
            if (sortedIndex == i) {
                count++;
            } else if (sortedIndex > i) {
                count++;
                junpIndex = sortedIndex;
            }
        }
        return count;
    }
}
