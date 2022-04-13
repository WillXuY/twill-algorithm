package org.willxu.algorithm.service.impl.boolist;

import org.willxu.algorithm.service.boolist.KidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandiesMax
        implements KidsWithTheGreatestNumberOfCandies {
    @Override
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for (int i: candies) {
            max = Math.max(max, i);
        }
        int least = max - extraCandies;
        List<Boolean> output = new ArrayList<>();
        for (int i: candies) {
            output.add(i >= least);
        }
        return output;
    }
}
