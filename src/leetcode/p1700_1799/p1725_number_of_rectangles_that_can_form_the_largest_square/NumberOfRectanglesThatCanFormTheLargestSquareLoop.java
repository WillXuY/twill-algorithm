package leetcode.p1700_1799.p1725_number_of_rectangles_that_can_form_the_largest_square;

public class NumberOfRectanglesThatCanFormTheLargestSquareLoop
        implements NumberOfRectanglesThatCanFormTheLargestSquare {
    @Override
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int count = 0;
        for (int[] r: rectangles) {
            int square = Math.min(r[0], r[1]);
            if (square > max) {
                max = square;
                count = 1;
            } else if (square == max) {
                count++;
            }
        }
        return count;
    }
}
