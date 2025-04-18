package leetcode.p0800_0899.p0892_surface_area_of3d_shapes;

public interface SurfaceAreaOf3dShapes {
    /**
     * You are given an n x n grid where you have placed some 1 x 1 x 1
     * cubes. Each value v = grid[i][j] represents a tower of v cubes
     * placed on top of cell (i, j).
     * After placing these cubes, you have decided to glue any directly
     * adjacent cubes to each other, forming several irregular 3D
     * shapes.
     * Return the total surface area of the resulting shapes.
     * Note: The bottom face of each shape counts toward its surface
     * area.
     *
     * @param grid 1 <= grid.length == grid[i].length <= 50
     *             0 <= grid[i][j] <= 50
     * @return the total surface area of the resulting shapes.
     */
    int surfaceArea(int[][] grid);
}
