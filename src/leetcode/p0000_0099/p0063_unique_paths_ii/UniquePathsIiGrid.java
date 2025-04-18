package leetcode.p0000_0099.p0063_unique_paths_ii;

public class UniquePathsIiGrid implements UniquePathsIi {
    @Override
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowLength = obstacleGrid.length;
        int columnLength = obstacleGrid[0].length;
        if (obstacleGrid[rowLength - 1][columnLength - 1] == 1
                || obstacleGrid[0][0] == 1) {
            return 0;
        }
        int[][] result = new int[rowLength][columnLength];
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                } else if (i == 0) {
                    if (j == 0) {
                        result[i][j] = 1;
                    } else if (result[i][j - 1] == 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else if (j == 0) {
                    if (result[i - 1][j] == 0) {
                        result[i][j] = 0;
                    } else {
                        result[i][j] = 1;
                    }
                } else {
                    result[i][j] = result[i - 1][j] + result[i][j - 1];
                }
            }
        }
        return result[rowLength - 1][columnLength - 1];
    }
}
