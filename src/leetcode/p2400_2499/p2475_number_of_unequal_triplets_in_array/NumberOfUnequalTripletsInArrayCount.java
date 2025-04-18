package leetcode.p2400_2499.p2475_number_of_unequal_triplets_in_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfUnequalTripletsInArrayCount
        implements NumberOfUnequalTripletsInArray {
    @Override
    public int unequalTriplets(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int n: nums) {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        }
        List<Integer> countList = new ArrayList<>(countMap.values());
        int output = 0;
        int amountLeftFirst = nums.length;
        for (int i = 0; i < countList.size() - 2; i++) {
            int first = countList.get(i);
            amountLeftFirst -= first;
            int amountLeftSecond = amountLeftFirst;
            for (int j = i + 1; j < countList.size() - 1; j++) {
                int second = countList.get(j);
                amountLeftSecond -= second;
                output += first * second * amountLeftSecond;
            }
        }
        return output;
    }
}
