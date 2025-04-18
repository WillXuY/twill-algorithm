package leetcode.p2300_2399.p2363_merge_similar_items;

import java.util.List;

public interface MergeSimilarItems {
    /**
     * You are given two 2D integer arrays, items1 and items2,
     * representing two sets of items. Each array items has the
     * following properties:
     * <p>
     * - items[i] = [value_i, weight_i] where value_i represents the
     *   value and weight_i represents the weight of the ith item.
     * - The value of each item in items is unique.
     * <p>
     * Return a 2D integer array ret where ret[i] = [value_i, weight_i],
     * with weight_i being the sum of weights of all items with value
     * value_i.
     * <p>
     * Note: ret should be returned in ascending order by value.
     *
     * @param items1 1 <= items1.length, items2.length <= 1000
     *               items1[i].length == items2[i].length == 2
     *               1 <= value_i, weight_i <= 1000
     *               Each value_i in items1 is unique.
     * @param items2 Each value_i in items2 is unique.
     */
    List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2);
}
