package leetcode.p2100_2199.p2108_find_first_palindromic_string_in_the_array;

public class FindFirstPalindromicStringInTheArrayLoop
        implements FindFirstPalindromicStringInTheArray {
    @Override
    public String firstPalindrome(String[] words) {
        for (String w: words) {
            if (isPalindromic(w)) {
                return w;
            }
        }
        return "";
    }

    private boolean isPalindromic(String word) {
        char[] chars = word.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len / 2; i++) {
            if (chars[i] != chars[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
