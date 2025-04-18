package leetcode.p0900_0999.p0938_range_sum_of_bst;

import common.provide.TreeNode;

public class RangeSumOfBstRecursive implements RangeSumOfBst {
    /**
     * 1. Check low high with root.
     * 2. if root < low, return rangeSumBST(right).
     * 3. if root <= high, return r(left) + root.val + r(right).
     * 4. if root > high, return rangeSumBST(left).
     *
     * @param root 1 <= root.size <= 2 * 10^4
     *             1 <= Node.val <= 10^5
     *             All Node.val are unique.
     * @param low 1 <= low <= high <= 10^5
     * @param high 1 <= low <= high <= 10^5
     * @return r(left) + check(root.val) + r(right);
     */
    @Override
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        } else if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        } else if (root.val <= high) {
            return rangeSumBST(root.left, low, high) + root.val
                    + rangeSumBST(root.right, low, high);
        } else {
            return rangeSumBST(root.left, low, high);
        }
    }
}
