package org.willxu.algorithm.service.integer;

import java.util.List;

public interface CountItemsMatchingRule {
    /**
     * You are given an array items, where each items[i] =
     * [type_i, color_i, name_i] describes the type, color, and name of
     * the ith item. You are also given a rule represented by two
     * strings, ruleKey and ruleValue.
     *
     * The i^th item is said to match the rule if one of the following
     * is true:
     *
     * - ruleKey == "type" and ruleValue == type_i.
     * - ruleKey == "color" and ruleValue == color_i.
     * - ruleKey == "name" and ruleValue == name_i.
     *
     * Return the number of items that match the given rule.
     *
     * @param items 1 <= items.length <= 104
     *              1 <= type_i.length, color_i.length, name_i.length,
     *              ruleValue.length <= 10
     *              consist only of lowercase letters.
     * @param ruleKey is equal to either "type", "color", or "name".
     * @param ruleValue consist only of lowercase letters.
     */
    int countMatches(List<List<String>> items, String ruleKey,
                     String ruleValue);
}
