package leetcode.p1600_1699.p1652_defuse_the_bomb;

public interface DefuseTheBomb {
    /**
     * You have a bomb to defuse, and your time is running out! Your
     * informer will provide you with a circular array code of length of
     * n and a key k.
     *
     * To decrypt the code, you must replace every number. All the
     * numbers are replaced simultaneously.
     *
     * If k > 0, replace the ith number with the sum of the next k
     * numbers.
     * If k < 0, replace the ith number with the sum of the previous k
     * numbers.
     * If k == 0, replace the ith number with 0.
     * As code is circular, the next element of code[n-1] is code[0],
     * and the previous element of code[0] is code[n-1].
     *
     * Given the circular array code and an integer key k, return the
     * decrypted code to defuse the bomb!
     *
     * @param code n == code.length
     *             1 <= n <= 100
     *             1 <= code[i] <= 100
     * @param k -(n - 1) <= k <= n - 1
     */
    int[] decrypt(int[] code, int k);
}
