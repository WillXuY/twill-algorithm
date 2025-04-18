package leetcode.p0300_0399.p0392_is_subsequence;

public class IsSubsequenceIterator implements IsSubsequence {
    @Override
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        char[] chars = t.toCharArray();
        for (char c: s.toCharArray()) {
            if (index >= t.length()) {
                return false;
            }
            while (c != chars[index]) {
                index++;
                if (index == t.length()) {
                    return false;
                }
            }
            index++;
        }
        return true;
    }
}
