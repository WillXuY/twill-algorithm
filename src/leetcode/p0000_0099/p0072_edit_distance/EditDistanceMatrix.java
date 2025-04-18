package leetcode.p0000_0099.p0072_edit_distance;

public class EditDistanceMatrix implements EditDistance {
    @Override
    public int minDistance(String word1, String word2) {
        int[][] matrix = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[0][i] = i;
        }
        for (int row = 1; row < matrix.length; row++) {
            matrix[row][0] = row;
            for (int col = 1; col < matrix[row].length; col++) {
                int left = matrix[row][col - 1] + 1;
                int top = matrix[row - 1][col] + 1;
                int leftTop = matrix[row - 1][col - 1];
                if (word1.charAt(row - 1) != word2.charAt(col - 1)) {
                    leftTop++;
                }
                matrix[row][col] = Math.min(leftTop, Math.min(left, top));
            }
        }
        return matrix[word1.length()][word2.length()];
    }
}
