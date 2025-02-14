package org.willxu.algorithm.service.integer;

public interface MinimumInsertionsToBalanceParenthesesString {
	/**
	 * Given a parentheses string s containing only the characters '('
	 * and ')'. A parentheses string is balanced if:
	 * <p>
	 * - Any left parenthesis '(' must have a corresponding two
	 *   consecutive right parenthesis '))'.
	 * - Left parenthesis '(' must go before the corresponding two
	 *   consecutive right parenthesis '))'.
	 * <p>
	 * In other words, we treat '(' as an opening parenthesis and '))'
	 * as a closing parenthesis.
	 * <p>
	 * - For example, "())", "())(())))" and "(())())))" are balanced,
	 *   ")()", "()))" and "(()))" are not balanced.
	 * <p>
	 * You can insert the characters '(' and ')' at any position of the
	 * string to balance it if needed.
	 * <p>
	 * Return the minimum number of insertions needed to make s balanced.
	 * 
	 * @param s 1 <= s.length <= 10^5
	 *          consists of '(' and ')' only.
	 */
	int minInsertions(String s);
}
