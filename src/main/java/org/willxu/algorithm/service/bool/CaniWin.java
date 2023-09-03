package org.willxu.algorithm.service.bool;

public interface CaniWin {
    /**
     * In the "100 game" two players take turns adding, to a running
     * total, any integer from 1 to 10. The player who first causes the
     * running total to reach or exceed 100 wins.
     * <p>
     * What if we change the game so that players cannot re-use integers?
     * <p>
     * For example, two players might take turns drawing from a common
     * pool of numbers from 1 to 15 without replacement until they reach
     * a total >= 100.
     * <p>
     * Given two integers maxChoosableInteger and desiredTotal, return
     * true if the first player to move can force a win, otherwise,
     * return false. Assume both players play optimally.
     *
     * @param maxChoosableInteger 1 <= maxChoosableInteger <= 20
     * @param desiredTotal 0 <= desiredTotal <= 300
     */
    boolean canIWin(int maxChoosableInteger, int desiredTotal);
}
