package leetcode.p1000_1099.p1025_divisior_game;

public interface DivisorGame {
    /**
     * Alice and Bob take turns playing a game, with Alice starting
     * first.
     * Initially, there is a number n on the chalkboard. On each
     * player's turn, that player makes a move consisting of:
     * - Choosing any x with 0 < x < n and n % x == 0.
     * - Replacing the number n on the chalkboard with n - x.
     * Also, if a player cannot make a move, they lose the game.
     * Return true if and only if Alice wins the game, assuming both
     * players play optimally.
     *
     * @param n 1 <= n <= 1000
     * @return can Alice must win the game.
     */
    boolean divisorGame(int n);
}
