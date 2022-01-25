package org.willxu.algorithm.service.integer;

public interface FindTheTownJudge {
    /**
     * In a town, there are n people labeled from 1 to n. There is a
     * rumor that one of these people is secretly the town judge.
     * If the town judge exists, then:
     * 1. The town judge trusts nobody.
     * 2. Everybody (except for the town judge) trusts the town judge.
     * 3. There is exactly one person that satisfies properties 1 and 2.
     * You are given an array trust where trust[i] = [a_i, b_i]
     * representing that person labeled a_i trusts the person labeled
     * b_i.
     * Return the label of the town judge if the town judge exists and
     * can be identified, or return -1 otherwise.
     *
     * @param n 1 <= n <= 1000
     * @param trust 0 <= trust.length <= 10^4
     *              trust[i].length == 2
     *              All the pairs of trust are unique.
     *              a_i != b_i
     *              1 <= a_i, b_i <= n
     * @return find the judge in n by the trust info array.
     */
    int findJudge(int n, int[][] trust);
}
