package leetcode.p1800_1899.p1886_determine_whether_matrix_can_be_obtained_by_rotation;

public class DetermineWhetherMatrixCanBeObtainedByRotationFour
        implements DetermineWhetherMatrixCanBeObtainedByRotation {
    @Override
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean zero = true, first = true, second = true, third = true;
        int len = mat.length;
        for (int i = 0; i < len; i++) {
            int[] column = mat[i];
            for (int j = 0; j < len; j++) {
                if (zero && column[j] != target[i][j]) {
                    zero = false;
                }
                if (first && column[j] != target[j][len - i - 1]) {
                    first = false;
                }
                if (second && column[j] != target[len - 1 - i][len - 1 - j]) {
                    second = false;
                }
                if (third && column[j] != target[len - j - 1][i]) {
                    third = false;
                }
                if (!zero && !first && !second && !third) {
                    return false;
                }
            }
        }
        return true;
    }
}
