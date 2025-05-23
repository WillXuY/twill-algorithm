package leetcode.p1600_1699.p1624_largest_substring_between_two_equal_characters;

import java.util.HashMap;
import java.util.Map;

public class LargestSubstringBetweenTwoEqualCharactersIndex
        implements LargestSubstringBetweenTwoEqualCharacters {
    @Override
    public int maxLengthBetweenEqualCharacters(String s) {
        int output = -1;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (charIndexMap.containsKey(c)) {
                int length = i - charIndexMap.get(c) - 1;
                if (length > output) {
                    output = length;
                }
            } else {
                charIndexMap.put(c, i);
            }
        }
        return output;
    }
}
