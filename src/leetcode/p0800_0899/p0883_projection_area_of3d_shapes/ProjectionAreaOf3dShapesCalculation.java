package leetcode.p0800_0899.p0883_projection_area_of3d_shapes;

public class ProjectionAreaOf3dShapesCalculation
        implements ProjectionAreaOf3dShapes {
    @Override
    public int projectionArea(int[][] grid) {
        int countTop = 0;
        int countLength = 0;
        int countWidth = 0;
        for (int[] value : grid) {
            int maxWidth = 0;
            for (int i : value) {
                if (i > 0) {
                    countTop++;
                }
                if (i > maxWidth) {
                    maxWidth = i;
                }
            }
            countWidth += maxWidth;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int maxLength = 0;
            for (int[] ints : grid) {
                if (ints[i] > maxLength) {
                    maxLength = ints[i];
                }
            }
            countLength += maxLength;
        }
        return countTop + countWidth + countLength;
    }
}
