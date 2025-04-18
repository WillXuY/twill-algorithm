package leetcode.p0100_0199.p0120_triangle;

import java.util.ArrayList;
import java.util.List;

public class TriangleList implements Triangle {
    @Override
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> minList = new ArrayList<>();
        List<Integer> top = triangle.get(0);
        minList.add(top.get(0));
        for (int size = 2; size <= triangle.size(); size++) {
            List<Integer> level = triangle.get(size - 1);
            List<Integer> nextMinList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int lastLeftIndex = i - 1;
                int leftCount = Integer.MAX_VALUE;
                int rightCount = Integer.MAX_VALUE;
                if (lastLeftIndex >= 0) {
                    leftCount = minList.get(lastLeftIndex) + level.get(i);
                }
                if (i < size - 1) {
                    rightCount = minList.get(i) + level.get(i);
                }
                nextMinList.add(Math.min(leftCount, rightCount));
            }
            minList = nextMinList;
        }
        int result = Integer.MAX_VALUE;
        for (int m: minList) {
            if (m < result) {
                result = m;
            }
        }
        return result;
    }
}
