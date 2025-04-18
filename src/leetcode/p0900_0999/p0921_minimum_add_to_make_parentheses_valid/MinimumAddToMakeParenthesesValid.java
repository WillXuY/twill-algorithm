package leetcode.p0900_0999.p0921_minimum_add_to_make_parentheses_valid;

public interface MinimumAddToMakeParenthesesValid {
    /**
     * A parentheses string is valid if and only if:
     * <p>
     * - It is the empty string,
     * - It can be written as AB (A concatenated with B), where A and B
     *   are valid strings, or
     * - It can be written as (A), where A is a valid string.
     * <p>
     * You are given a parentheses string s. In one move, you can insert
     * a parenthesis at any position of the string.
     * <p>
     * - For example, if s = "()))", you can insert an opening
     *   parenthesis to be "(()))" or a closing parenthesis to be
     *   "())))".
     * <p>
     * Return the minimum number of moves required to make s valid.
     *
     * @param s 1 <= s.length <= 1000
     *          s[i] is either '(' or ')'.
     */
    int minAddToMakeValid(String s);
}
