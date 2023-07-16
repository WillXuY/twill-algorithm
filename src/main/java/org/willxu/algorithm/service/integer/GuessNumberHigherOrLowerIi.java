package org.willxu.algorithm.service.integer;

public interface GuessNumberHigherOrLowerIi {
    /**
     * We are playing the Guessing Game. The game will work as follows:
     * <p>
     * I pick a number between 1 and n.
     * <p>
     * You guess a number.
     * <p>
     * If you guess the right number, you win the game.
     * <p>
     * If you guess the wrong number, then I will tell you whether the
     * number I picked is higher or lower, and you will continue
     * guessing.
     * <p>
     * Every time you guess a wrong number x, you will pay x dollars. If
     * you run out of money, you lose the game.
     * <p>
     * Given a particular n, return the minimum amount of money you need
     * to guarantee a win regardless of what number I pick.
     *
     * @param n 1 <= n <= 200
     */
    int getMoneyAmount(int n);
}
