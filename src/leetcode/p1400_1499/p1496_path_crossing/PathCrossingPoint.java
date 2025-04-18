package leetcode.p1400_1499.p1496_path_crossing;

import java.util.HashSet;
import java.util.Set;

public class PathCrossingPoint implements PathCrossing {
    @Override
    public boolean isPathCrossing(String path) {
        Set<String> pointSet = new HashSet<>();
        int[] point = new int[] {0, 0};
        for (char c: path.toCharArray()) {
            pointSet.add(point[0] + "," + point[1]);
            switch (c) {
                case 'N' -> point[1] = point[1] + 1;
                case 'S' -> point[1] = point[1] - 1;
                case 'E' -> point[0] = point[0] + 1;
                case 'W' -> point[0] = point[0] - 1;
            }
            if (pointSet.contains(point[0] + "," + point[1])) {
                return true;
            }
        }
        return false;
    }
}
