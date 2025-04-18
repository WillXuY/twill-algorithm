package leetcode.p0000_0099.p0096_unique_binary_search_trees;

public class UniqueBinarySearchTreesRecursive
        implements UniqueBinarySearchTrees {
    @Override
    public int numTrees(int n) {
        int result = 0;
        if (n <= 1) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            int left = numTrees(i - 1);
            int right = numTrees(n - i);
            result += left * right;
        }
        return result;
    }
}
