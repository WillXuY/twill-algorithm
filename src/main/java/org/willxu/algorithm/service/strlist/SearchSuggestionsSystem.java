package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface SearchSuggestionsSystem {
    /**
     * You are given an array of strings products and a string
     * searchWord.
     * <p>
     * Design a system that suggests at most three product names from
     * products after each character of searchWord is typed. Suggested
     * products should have common prefix with searchWord. If there are
     * more than three products with a common prefix return the three
     * lexicographically minimums products.
     * <p>
     * Return a list of lists of the suggested products after each
     * character of searchWord is typed.
     *
     * @param products 1 <= products.length <= 1000
     *                 1 <= products[i].length <= 3000
     *                 1 <= sum(products[i].length) <= 2 * 10^4
     *                 All the strings of products are unique.
     *                 products[i] consists of lowercase English letters.
     * @param searchWord 1 <= searchWord.length <= 1000
     *                   searchWord consists of lowercase English
     *                   letters.
     */
    List<List<String>> suggestedProducts(String[] products, String searchWord);
}
