package leetcode.p2000_2099.p2027_minimum_moves_to_convert_string;

public interface MinimumMovesToConvertString {
    /**
     * You are given a string s consisting of n characters which are
     * either 'X' or 'O'.
     * <p>
     * A move is defined as selecting three consecutive characters of s
     * and converting them to 'O'. Note that if a move is applied to the
     * character 'O', it will stay the same.
     * <p>
     * Return the minimum number of moves required so that all the
     * characters of s are converted to 'O'.
     *
     * @param s 3 <= s.length <= 1000
     *          s[i] is either 'X' or 'O'.
     */
    int minimumMoves(String s);
}
