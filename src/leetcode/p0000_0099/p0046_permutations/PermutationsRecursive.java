package leetcode.p0000_0099.p0046_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsRecursive implements Permutations {
    @Override
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> parent = Arrays.stream(nums).boxed().toList();
        return recursive(parent);
    }

    private List<List<Integer>> recursive(List<Integer> parent) {
        List<List<Integer>> result = new ArrayList<>();
        if (parent.size() == 0) {
            return result;
        } else if (parent.size() == 1) {
            result.add(new ArrayList<>(parent));
            return result;
        }
        for (int i = 0; i < parent.size(); i++) {
            List<Integer> left = new ArrayList<>(parent);
            left.remove(i);
            List<List<Integer>> sub = recursive(left);
            for (List<Integer> s: sub) {
                s.add(0, parent.get(i));
                result.add(s);
            }
        }
        return result;
    }
}
