package leetcode.p0300_0399.p0385_mini_parser;

import common.provide.NestedInteger;

public interface MiniParser {
    /**
     * Given a string s represents the serialization of a nested list,
     * implement a parser to deserialize it and return the deserialized
     * NestedInteger.
     * <p>
     * Each element is either an integer or a list whose elements may
     * also be integers or other lists.
     *
     * @param s 1 <= s.length <= 5 * 10^4
     *          s consists of digits, square brackets "[]", negative
     *          sign '-', and commas ','.
     *          s is the serialization of valid NestedInteger.
     *          All the values in the input are in the range
     *          [-10^6, 10^6].
     */
    NestedInteger deserialize(String s);
}
