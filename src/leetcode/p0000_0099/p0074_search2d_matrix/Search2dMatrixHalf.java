package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.Search2dMatrix;

public class Search2dMatrixHalf implements Search2dMatrix {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        if (target < matrix[0][0]
                || target > matrix[rowLength - 1][colLength - 1]) {
            return false;
        }
        int rowStart = 0, rowEnd = matrix.length - 1;
        int lastMid = -1;
        while (rowStart <= rowEnd) {
            int mid = (rowStart + rowEnd) / 2;
            if (target < matrix[mid][0]) {
                if (mid == rowStart) {
                    return false;
                }
                rowEnd = mid;
            } else if (target == matrix[mid][0]) {
                return true;
            } else {
                if (mid != lastMid) {
                    lastMid = mid;
                    rowStart = mid;
                } else {
                    int[] row = matrix[mid];
                    if (mid + 1 < matrix.length) {
                        if (matrix[mid + 1][0] == target) {
                            return true;
                        } else if (matrix[mid + 1][0] < target) {
                            row = matrix[mid + 1];
                        }
                    }
                    // start search in row.
                    int start = 0; int end = row.length - 1;
                    int lm = -1;
                    while (start <= end) {
                        int m = (start + end) / 2;
                        if (target < row[m]) {
                            if (m == start) {
                                return false;
                            }
                            end = m;
                        } else if (target == row[m]) {
                            return true;
                        } else {
                            if (m != lm) {
                                lm = m;
                                start = m;
                            } else {
                                return row[start] == target
                                        || row[end] == target;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
}
