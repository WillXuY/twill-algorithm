package leetcode.p1000_1099.p1047_remove_all_adjacent_duplicates_in_string;

public interface RemoveAllAdjacentDuplicatesInString {
    /**
     * You are given a string s consisting of lowercase English letters.
     * A duplicate removal consists of choosing two adjacent and equal
     * letters and removing them.
     * We repeatedly make duplicate removals on s until we no longer
     * can.
     * Return the final string after all such duplicate removals have
     * been made. It can be proven that the answer is unique.
     *
     * @param s 1 <= s.length <= 10^5
     *          consists of lowercase English letters.
     * @return remove s' duplicates letters recursively.
     */
    String removeDuplicates(String s);
}
