package leetcode.p1400_1499.p1422_maximum_score_after_splitting1_string;

public interface MaximumScoreAfterSplitting1String {
    /**
     * Given a string s of zeros and ones, return the maximum score
     * after splitting the string into two non-empty substrings (i.e.
     * left substring and right substring).
     * The score after splitting a string is the number of zeros in the
     * left substring plus the number of ones in the right substring.
     *
     * @param s 2 <= s.length <= 500
     *          consists of characters '0' and '1' only.
     * @return max score.
     */
    int maxScore(String s);
}
