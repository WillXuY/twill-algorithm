package leetcode.p1000_1099.p1051_height_checker;

public interface HeightChecker {
    /**
     * A school is trying to take an annual photo of all the students.
     * The students are asked to stand in a single file line in
     * non-decreasing order by height. Let this ordering be represented
     * by the integer array expected where expected[i] is the expected
     * height of the i-th student in line.
     * You are given an integer array heights representing the current
     * order that the students are standing in. Each heights[i] is the
     * height of the i-th student in line (0-indexed).
     * Return the number of indices where heights[i] != expected[i].
     *
     * @param heights 1 <= heights.length <= 100
     *                1 <= heights[i] <= 100
     * @return the difference of heights and sorted heights.
     */
    int heightChecker(int[] heights);
}
