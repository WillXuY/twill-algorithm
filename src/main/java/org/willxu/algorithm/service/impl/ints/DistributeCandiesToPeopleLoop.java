package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.DistributeCandiesToPeople;

public class DistributeCandiesToPeopleLoop
        implements DistributeCandiesToPeople {
    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] output = new int[num_people];
        int num = 1;
        int index = 0;
        while (candies > 0) {
            output[index] += Math.min(candies, num);
            index++;
            if (index >= num_people) {
                index = 0;
            }
            candies -= num;
            num++;
        }
        return output;
    }
}
