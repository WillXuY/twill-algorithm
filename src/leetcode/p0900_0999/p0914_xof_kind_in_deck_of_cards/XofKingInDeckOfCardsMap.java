package leetcode.p0900_0999.p0914_xof_kind_in_deck_of_cards;

import java.util.*;

public class XofKingInDeckOfCardsMap implements XofKingInDeckOfCards {
    @Override
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> sameMap = new HashMap<>();
        for (int i: deck) {
            if (sameMap.containsKey(i)) {
                sameMap.put(i, sameMap.get(i) + 1);
            } else {
                sameMap.put(i, 1);
            }
        }
        int greatestCommonDivisor = getGreatestCommonDivisor(sameMap.values());
        return greatestCommonDivisor > 1;
    }

    private int getGreatestCommonDivisor(Collection<Integer> sizeCollection) {
        TreeSet<Integer> commonDivisor = new TreeSet<>();
        boolean first = true;
        for (int v: sizeCollection) {
            if (first) {
                for (int i = 1; i <= v; i++) {
                    if (v % i == 0) {
                        commonDivisor.add(i);
                    }
                }
                first = false;
            } else {
                Iterator<Integer> iterator = commonDivisor.iterator();
                while (iterator.hasNext()) {
                    int d = iterator.next();
                    if (v % d != 0) {
                        iterator.remove();
                    }
                    if (commonDivisor.size() < 2) {
                        return 1;
                    }
                }
            }
        }
        return commonDivisor.last();
    }
}
