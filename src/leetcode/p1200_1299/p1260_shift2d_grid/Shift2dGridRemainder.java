package leetcode.p1200_1299.p1260_shift2d_grid;

import java.util.ArrayList;
import java.util.List;

public class Shift2dGridRemainder implements Shift2dGrid {
    @Override
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> output = new ArrayList<>();
        int remainder = k % (grid.length * grid[0].length);
        int rowOffset = remainder / grid[0].length;
        int columnOffset = remainder % grid[0].length;
        for (int row = 0; row < grid.length; row++) {
            List<Integer> listRow = new ArrayList<>();
            for (int column = 0; column < grid[row].length; column++) {
                int outputRow = row - rowOffset;
                if (outputRow < 0) {
                    outputRow += grid.length;
                }
                int outputColumn = column - columnOffset;
                if (outputColumn < 0) {
                    outputColumn += grid[row].length;
                    outputRow--;
                    if (outputRow < 0) {
                        outputRow += grid.length;
                    }
                }
                listRow.add(grid[outputRow][outputColumn]);
            }
            output.add(listRow);
        }
        return output;
    }
}
