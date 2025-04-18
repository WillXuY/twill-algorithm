package leetcode.p1000_1099.p1047_remove_all_adjacent_duplicates_in_string;

public class RemoveAllAdjacentDuplicatesInStringRegex
        implements RemoveAllAdjacentDuplicatesInString {
    @Override
    public String removeDuplicates(String s) {
        while (s.length() > 0) {
            String newStr = s.replaceAll("([a-z])\\1", "");
            if (s.equals(newStr)) {
                break;
            } else {
                s = newStr;
            }
        }
        return s;
    }
}
