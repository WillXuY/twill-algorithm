package leetcode.p0700_0799.p0754_reach_number;

import java.util.HashSet;
import java.util.Set;

public class ReachNumberSet implements ReachNumber {
    @Override
    public int reachNumber(int target) {
        Set<Integer> reachSet = new HashSet<>();
        reachSet.add(0);
        int step = 1;
        while (reachSet.size() < Integer.MAX_VALUE) {
            Set<Integer> newReachSet = new HashSet<>();
            boolean matched = false;
            for (int r: reachSet) {
                int left = r - step;
                int right = r + step;
                if (left == target || right == target) {
                    matched = true;
                    break;
                }
                newReachSet.add(left);
                newReachSet.add(right);
            }
            if (matched) {
                break;
            }
            reachSet = newReachSet;
            step++;
        }
        return step;
    }
}
