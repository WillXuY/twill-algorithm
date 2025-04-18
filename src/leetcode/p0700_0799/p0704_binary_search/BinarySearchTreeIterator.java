package leetcode.p0700_0799.p0704_binary_search;

/**
 * Implement the BSTIterator class that represents an iterator over the
 * in-order traversal of a binary search tree (BST):
 * <p>
 * BSTIterator(TreeNode root) Initializes an object of the BSTIterator
 * class. The root of the BST is given as part of the constructor. The
 * pointer should be initialized to a non-existent number smaller than
 * any element in the BST.
 * Notice that by initializing the pointer to a non-existent smallest
 * number, the first call to next() will return the smallest element
 * in the BST.
 * <p>
 * You may assume that next() calls will always be valid. That is, there
 * will be at least a next number in the in-order traversal when next()
 * is called.
 */
public interface BinarySearchTreeIterator {
    /**
     * Moves the pointer to the right, then returns the number at the
     * pointer.
     *
     * @return the number at the pointer.
     */
    int next();

    /**
     * @return true if there exists a number in the traversal to the
     * right of the pointer, otherwise returns false.
     */
    boolean hasNext();
}
