package leetcode.p1000_1099.p1046_last_stone_weight;

import java.util.Arrays;

public class LastStoneWeightLoop implements LastStoneWeight {
    @Override
    public int lastStoneWeight(int[] stones) {
        while (stones.length > 1) {
            stones = destroyTwo(stones);
        }
        return stones.length < 1 ? 0 : stones[0];
    }

    private int[] destroyTwo(int[] stones) {
        int maxIndex = 0;
        int secondIndex = 0;
        if (stones[0] > stones[1]) {
            secondIndex = 1;
        } else {
            maxIndex = 1;
        }
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > stones[maxIndex]) {
                secondIndex = maxIndex;
                maxIndex = i;
            } else if (stones[i] > stones[secondIndex] && maxIndex != i) {
                secondIndex = i;
            }
        }
        int diff = stones[maxIndex] - stones[secondIndex];
        if (diff == 0) {
            if (secondIndex == stones.length - 1) {
                stones = removeIndex(stones, secondIndex);
                stones = removeIndex(stones, maxIndex);
            } else {
                stones = removeIndex(stones, maxIndex);
                stones = removeIndex(stones, secondIndex);
            }
        } else {
            stones[secondIndex] = diff;
            stones = removeIndex(stones, maxIndex);
        }
        return stones;
    }

    private int[] removeIndex(int[] stones, int index) {
        int maxIndex = stones.length - 1;
        if (index != maxIndex) {
            stones[index] = stones[index] ^ stones[maxIndex];
            stones[maxIndex] = stones[index] ^ stones[maxIndex];
            stones[index] = stones[index] ^ stones[maxIndex];
        }
        return Arrays.copyOfRange(stones, 0, stones.length - 1);
    }
}
