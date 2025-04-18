package leetcode.p0000_0099.p0090_subsets_ii;

import java.util.*;

public class SubsetsIiRecursive implements SubsetsIi {
    @Override
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) {
            result.add(Collections.emptyList());
            return result;
        } else if (nums.length == 1) {
            result.add(Collections.emptyList());
            List<Integer> res = new ArrayList<>();
            res.add(nums[0]);
            result.add(res);
            return result;
        }
        Set<List<Integer>> resultSet = new HashSet<>();
        resultSet.add(Collections.emptyList());
        for (int i = 0; i < nums.length; i++) {
            int[] subArray = Arrays.copyOfRange(nums, i + 1, nums.length);
            List<List<Integer>> subList = subsetsWithDup(subArray);
            for (List<Integer> sub: subList) {
                List<Integer> res = new ArrayList<>();
                res.add(nums[i]);
                res.addAll(sub);
                Collections.sort(res);
                resultSet.add(res);
            }
        }
        return new ArrayList<>(resultSet);
    }
}
