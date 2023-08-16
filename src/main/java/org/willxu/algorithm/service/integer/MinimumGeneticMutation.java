package org.willxu.algorithm.service.integer;

public interface MinimumGeneticMutation {
    /**
     * A gene string can be represented by an 8-character long string,
     * with choices from 'A', 'C', 'G', and 'T'.
     * <p>
     * Suppose we need to investigate a mutation from a gene string
     * startGene to a gene string endGene where one mutation is defined
     * as one single character changed in the gene string.
     * <p>
     * - For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
     * <p>
     * There is also a gene bank bank that records all the valid gene
     * mutations. A gene must be in bank to make it a valid gene string.
     * <p>
     * Given the two gene strings startGene and endGene and the gene
     * bank bank, return the minimum number of mutations needed to
     * mutate from startGene to endGene. If there is no such a mutation,
     * return -1.
     * <p>
     * Note that the starting point is assumed to be valid, so it might
     * not be included in the bank.
     *
     * @param startGene 0 <= bank.length <= 10
     *                  startGene.length == endGene.length ==
     *                  bank[i].length == 8
     *                  startGene, endGene, and bank[i] consist of only
     *                  the characters ['A', 'C', 'G', 'T'].
     * @param endGene consist of only the characters ['A', 'C', 'G', 'T'].
     * @param bank consist of only the characters ['A', 'C', 'G', 'T'].
     */
    int minMutation(String startGene, String endGene, String[] bank);
}
