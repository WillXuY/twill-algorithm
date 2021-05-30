package org.willxu.algorithm.service.integer;

public interface RomanToInteger {
    /**
     * Roman numerals are represented by seven different symbols:
     *     I, V, X, L, C, D and M.
     *<p>Example:
     *<table border>
     * <caption><b>Roman Symbol Value Examples</b></caption>
     *<tr valign=top><th>Roman Symbol</th> <th>Integer Value</th>
     *<tr align=right><td>I</td> <td>1</td>
     *<tr align=right><td>V</td> <td>5</td>
     *<tr align=right><td>X</td> <td>10</td>
     *<tr align=right><td>L</td> <td>50</td>
     *<tr align=right><td>C</td> <td>100</td>
     *<tr align=right><td>D</td> <td>500</td>
     *<tr align=right><td>M</td> <td>1000</td>
     *</table>
     * For example, 2 is written as II in ROman numeral, just two one's added
     * together. 12 is wriiten as XII, which is simply X + II. The number 27
     * is XX + V + II.
     * Roman numerals are usually written largest to smallest from left to
     * right. However, the numeral for four is not IIII. Instead, the number
     * four is written as IV. Because the one is before the five we subtract
     * it making four. The same principle applies to the number nine, which is
     * written as IX. There are six instances where subtraction is used:
     * - I can be placed before V (5) and X(10) to make 4 and 9.
     * - X can be placed before L (50) and C(100) to make 40 and 90.
     * - C can be placed before D (500) and M(1000) to make 400 and 900.
     * Given a roman numeral, convert it to an integer.
     * @param s 1<= s.length <= 15, contains only the characters
     *          ('I', 'V', 'X', 'L', 'C', 'D', 'M').
     *          It is guaranteed that s is a valid roman numeral in the range
     *          [1, 3999].
     * @return integer number equals Roman number.
     */
    int romanToInteger(String s);
}
