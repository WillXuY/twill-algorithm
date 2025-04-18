package leetcode.p2300_2399.p2379_minimum_recolors_to_get_consecutive_black_blocks;

public interface MinimumRecolorsToGetConsecutiveBlackBlocks {
    /**
     * You are given a 0-indexed string blocks of length n, where
     * blocks[i] is either 'W' or 'B', representing the color of the ith
     * block. The characters 'W' and 'B' denote the colors white and
     * black, respectively.
     * <p>
     * You are also given an integer k, which is the desired number of
     * consecutive black blocks.
     * <p>
     * In one operation, you can recolor a white block such that it
     * becomes a black block.
     * <p>
     * Return the minimum number of operations needed such that there is
     * at least one occurrence of k consecutive black blocks.
     *
     * @param blocks 1 <= blocks.length <= 100
     *               blocks[i] is either 'W' or 'B'.
     * @param k 1 <= k <= n
     */
    int minimumRecolors(String blocks, int k);
}
