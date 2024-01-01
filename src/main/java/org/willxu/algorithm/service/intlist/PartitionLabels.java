package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface PartitionLabels {
    /**
     * You are given a string s. We want to partition the string into as
     * many parts as possible so that each letter appears in at most one
     * part.
     * <p>
     * Note that the partition is done so that after concatenating all
     * the parts in order, the resultant string should be s.
     * <p>
     * Return a list of integers representing the size of these parts.
     *
     * @param s 1 <= s.length <= 500
     *          consists of lowercase English letters.
     */
    List<Integer> partitionLabels(String s);
}
