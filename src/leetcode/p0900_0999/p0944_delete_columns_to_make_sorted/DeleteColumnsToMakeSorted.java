package leetcode.p0900_0999.p0944_delete_columns_to_make_sorted;

public interface DeleteColumnsToMakeSorted {
    /**
     * You are given an array of n strings strs, all of the same length.
     * The strings can be arranged such that there is one on each line,
     * making a grid. For example, strs = ["abc", "bce", "cae"] can be
     * arranged as:
     * abc
     * bce
     * cae
     * You want to delete the columns that are not sorted
     * lexicographically. In the above example (0-indexed), columns 0
     * ('a', 'b', 'c') and 2('c', 'e', 'e') are sorted while column 1
     * ('b', 'c', 'a') is not, so you would delete column 1.
     * Return the number of columns that you will delete.
     *
     * @param strs 1 <= strs.length <= 100
     *             1 <= strs[i].length <= 1000
     *             strs[i] consists of lowercase English letters.
     * @return minimum number of columns which need to be deleted.
     */
    int minDeletionSize(String[] strs);
}
