package leetcode.p1500_1599.p1582_special_positions_in_binary_matrix;

public class SpecialPositionsInBinaryMatrixLoop
        implements SpecialPositionsInBinaryMatrix {
    @Override
    public int numSpecial(int[][] mat) {
        int output = 0;
        for (int[] row: mat) {
            int countRow = 0;
            int added = 0;
            for (int j = 0; j < row.length; j++) {
                if (row[j] == 1) {
                    countRow++;
                    if (countRow > 1) {
                        output -= added;
                        break;
                    }
                    int countCol = 0;
                    for (int[] r: mat) {
                        if (r[j] == 1) {
                            countCol++;
                            if (countCol > 1) {
                                break;
                            }
                        }
                    }
                    if (countCol < 2) {
                        added = 1;
                        output++;
                    }
                }
            }
        }
        return output;
    }
}
