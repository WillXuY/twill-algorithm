package leetcode.p0000_0099.p0011_container_with_most_water;

public class ContainerWithMostWaterLoop implements ContainerWithMostWater {
    @Override
    public int maxArea(int[] height) {
        int output = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int water = Math.min(height[i], height[j]) * (j - i);
                if (water > output) {
                    output = water;
                }
            }
        }
        return output;
    }
}
