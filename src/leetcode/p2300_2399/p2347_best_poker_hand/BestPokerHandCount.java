package leetcode.p2300_2399.p2347_best_poker_hand;

import java.util.HashMap;
import java.util.Map;

public class BestPokerHandCount implements BestPokerHand {
    @Override
    public String bestHand(int[] ranks, char[] suits) {
        if (suits[0] == suits[1] && suits[1] == suits[2]
                && suits[2] == suits[3] && suits[3] == suits[4]) {
            return BestPokerHand.FLUSH;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int r: ranks) {
            if (count.containsKey(r)) {
                count.put(r, count.get(r) + 1);
            } else {
                count.put(r, 1);
            }
        }
        int max = 1;
        for (int c: count.values()) {
            if (c > max) {
                max = c;
            }
        }
        if (max > 2) {
            return BestPokerHand.THREE;
        } else if (max == 2) {
            return BestPokerHand.PAIR;
        } else {
            return BestPokerHand.HIGH_CARD;
        }
    }
}
