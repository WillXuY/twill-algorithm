package leetcode.p0000_0099.p0003_longest_substring_without_repeating_characters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharactersSet
        implements LongestSubstringWithoutRepeatingCharacters {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int output = 0;
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (output > len - i) {
                break;
            }
            Set<Character> set = new HashSet<>();
            for (int j = 0; i + j < len; j++) {
                char c = chars[i + j];
                if (set.contains(c)) {
                    break;
                }
                set.add(c);
            }
            if (set.size() > output) {
                output = set.size();
            }
        }
        return output;
    }
}
