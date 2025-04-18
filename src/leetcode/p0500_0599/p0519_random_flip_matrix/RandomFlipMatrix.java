package leetcode.p0500_0599.p0519_random_flip_matrix;

/**
 * There is an m x n binary grid matrix with all the values set 0
 * initially. Design an algorithm to randomly pick an index (i, j) where
 * matrix[i][j] == 0 and flips it to 1. All the indices (i, j) where
 * matrix[i][j] == 0 should be equally likely to be returned.
 * <p>
 * Optimize your algorithm to minimize the number of calls made to the
 * built-in random function of your language and optimize the time and
 * space complexity.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(int m, int n) Initializes the object with the size of the
 * binary matrix m and n.
 */
public interface RandomFlipMatrix {
    /**
     * @return a random index [i, j] of the matrix where
     *         matrix[i][j] == 0 and flips it to 1.
     */
    int[] flip();

    /**
     * Resets all the values of the matrix to be 0.
     */
    void reset();
}
