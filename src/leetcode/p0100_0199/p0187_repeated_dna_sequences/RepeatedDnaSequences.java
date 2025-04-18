package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface RepeatedDnaSequences {
    /**
     * The DNA sequence is composed of a series of nucleotides
     * abbreviated as 'A', 'C', 'G', and 'T'.
     * <p>
     * - For example, "ACGAATTCCG" is a DNA sequence.
     * <p>
     * When studying DNA, it is useful to identify repeated sequences
     * within the DNA.
     * <p>
     * Given a string s that represents a DNA sequence, return all the
     * 10-letter-long sequences (substrings) that occur more than once
     * in a DNA molecule. You may return the answer in any order.
     *
     * @param s 1 <= s.length <= 105
     *          s[i] is either 'A', 'C', 'G', or 'T'.
     */
    List<String> findRepeatedDnaSequences(String s);
}
