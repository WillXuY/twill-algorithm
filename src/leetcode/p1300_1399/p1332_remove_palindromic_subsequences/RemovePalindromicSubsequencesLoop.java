package leetcode.p1300_1399.p1332_remove_palindromic_subsequences;

public class RemovePalindromicSubsequencesLoop
        implements RemovePalindromicSubsequences {
    @Override
    public int removePalindromeSub(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return 2;
            }
        }
        return 1;
    }
}
