package leetcode.p0900_0999.p0944_delete_columns_to_make_sorted;

public class DeleteColumnsToMakeSortedLoop
        implements DeleteColumnsToMakeSorted {
    /**
     * 1. Loop get all the index of strs.
     * 2. Loop and compare the order of char in strs.
     *
     * @param strs 1 <= strs.length <= 100
     *             1 <= strs[i].length <= 1000
     *             strs[i] consists of lowercase English letters.
     * @return delete count.
     */
    @Override
    public int minDeletionSize(String[] strs) {
        int deleteCount = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) < strs[j - 1].charAt(i)) {
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount;
    }
}
