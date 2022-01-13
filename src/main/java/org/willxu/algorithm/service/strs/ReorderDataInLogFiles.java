package org.willxu.algorithm.service.strs;

public interface ReorderDataInLogFiles {
    /**
     * You are given an array of logs. Each log is a space-delimited
     * string of words, where the first word is the identifier.
     * There are two types of logs:
     * - Letter-logs: All words (except the identifier) consist of
     *   lowercase English letters.
     * - Digit-logs: All words (except the identifier) consist of digits
     * Reorder these logs so that:
     * 1. The letter-logs come before all digit-logs.
     * 2. The letter-logs are sorted lexicographically by their
     *    contents. If their contents are the same, then sort them
     *    lexicographically by their identifiers.
     * 3. The digit-logs maintain their relative ordering.
     * Return the final order of the logs.
     *
     * @param logs 1 <= logs.length <= 100
     *             3 <= logs[i].length <= 100
     *             All the tokens of logs[i] are separated by single
     *             space.
     *             Logs[i] is guaranteed to have an identifier.
     * @return reordered logs.
     */
    String[] reorderLogFiles(String[] logs);
}
