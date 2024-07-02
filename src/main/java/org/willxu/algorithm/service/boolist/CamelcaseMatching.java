package org.willxu.algorithm.service.boolist;

import java.util.List;

public interface CamelcaseMatching {
    /**
     * Given an array of strings queries and a string pattern, return a
     * boolean array answer where answer[i] is true if queries[i]
     * matches pattern, and false otherwise.
     * <p>
     * A query word queries[i] matches pattern if you can insert
     * lowercase English letters pattern so that it equals the query.
     * You may insert each character at any position and you may not
     * insert any characters.
     *
     * @param queries 1 <= queries[i].length <= 100
     * @param pattern 1 <= pattern.length, queries.length <= 100
     *                queries[i] and pattern consist of English letters.
     */
    List<Boolean> camelMatch(String[] queries, String pattern);
}
