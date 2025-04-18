package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.FairCandySwap;

import java.util.Iterator;
import java.util.TreeSet;

public class FairCandySwapOrder implements FairCandySwap {
    /**
     * 1. count Alice's candies and Bob's candies.
     * 2. get the difference of two count numbers.
     * 3. order Alice's candies and Bob's.
     * 4. get the two number = (diff / 2).
     */
    @Override
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        TreeSet<Integer> treeSetAlice = new TreeSet<>();
        TreeSet<Integer> treeSetBob = new TreeSet<>();
        int countAlice = 0;
        int countBob = 0;
        for (int i: aliceSizes) {
            treeSetAlice.add(i);
            countAlice += i;
        }
        for (int i: bobSizes) {
            treeSetBob.add(i);
            countBob += i;
        }
        int diff = (countAlice - countBob) / 2;
        Iterator<Integer> iteratorAlice = treeSetAlice.iterator();
        Iterator<Integer> iteratorBob = treeSetBob.iterator();
        boolean aliceNext = true;
        boolean bobNext = true;
        int alice = 0;
        int bob = 0;
        while ((!aliceNext || iteratorAlice.hasNext())
                && (!bobNext || iteratorBob.hasNext())) {
            if (aliceNext) {
                alice = iteratorAlice.next();
            }
            if (bobNext) {
                bob = iteratorBob.next();
            }
            if (alice - bob == diff) {
                return new int[] {alice, bob};
            } else if (alice - bob > diff) {
                aliceNext = false;
                bobNext = true;
            } else {
                aliceNext = true;
                bobNext = false;
            }
        }
        return new int[0];
    }
}
