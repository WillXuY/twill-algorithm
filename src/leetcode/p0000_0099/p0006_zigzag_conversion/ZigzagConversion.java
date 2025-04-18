package leetcode.p0000_0099.p0006_zigzag_conversion;

public interface ZigzagConversion {
    /**
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a
     * given number of rows like this: (you may want to display this
     * pattern in a fixed font for better legibility)
     * <p>
     * P   A   H   N
     * A P L S I I G
     * Y   I   R
     * <p>
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * Write the code that will take a string and make this conversion
     * given a number of rows:
     * <p>
     * string convert(string s, int numRows);
     *
     * @param s 1 <= s.length <= 1000
     *          consists of English letters (lower-case and upper-case),
     *          ',' and '.'.
     * @param numRows 1 <= numRows <= 1000
     */
    String convert(String s, int numRows);
}
