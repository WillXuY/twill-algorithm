package leetcode.p1300_1399.p1380_lucky_numbers_in_matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrixLoop implements LuckyNumbersInMatrix {
    @Override
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        for (int[] row : matrix) {
            int minIndex = 0;
            for (int c = 1; c < row.length; c++) {
                if (row[c] < row[minIndex]) {
                    minIndex = c;
                }
            }
            boolean maxInColumn = true;
            for (int[] i : matrix) {
                if (i[minIndex] > row[minIndex]) {
                    maxInColumn = false;
                    break;
                }
            }
            if (maxInColumn) {
                output.add(row[minIndex]);
            }
        }
        return output;
    }
}
