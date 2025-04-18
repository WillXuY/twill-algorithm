package leetcode.p2000_2099.p2062_count_vowel_substrings_of_string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountVowelSubstringsOfStringCount
        implements CountVowelSubstringsOfString {
    @Override
    public int countVowelSubstrings(String word) {
        Set<Character> vowelSet = Stream.of('a', 'e', 'i', 'o', 'u')
                .collect(Collectors.toSet());
        int output = 0;
        char[] chars = word.toCharArray();
        for (int length = 5; length <= word.length(); length++) {
            Map<Character, Integer> existMap = new HashMap<>();
            Map<Character, Integer> notVowelMap = new HashMap<>();
            for (int i = 0; i < length; i++) {
                addCharSelective(vowelSet, chars[i], existMap, notVowelMap);
            }
            if (existMap.size() == 5 && notVowelMap.size() == 0) {
                output++;
            }
            for (int i = length; i < chars.length; i++) {
                char c = chars[i - length];
                if (existMap.containsKey(c)) {
                    int val = existMap.get(c);
                    if (val > 1) {
                        existMap.put(c, val - 1);
                    } else {
                        existMap.remove(c);
                    }
                }
                if (notVowelMap.containsKey(c)) {
                    int val = notVowelMap.get(c);
                    if (val > 1) {
                        notVowelMap.put(c, val - 1);
                    } else {
                        notVowelMap.remove(c);
                    }
                }
                addCharSelective(vowelSet, chars[i], existMap, notVowelMap);
                if (existMap.size() == 5 && notVowelMap.size() == 0) {
                    output++;
                }
            }
        }
        return output;
    }

    private void addCharSelective(Set<Character> vowelSet, char c,
                                  Map<Character, Integer> existMap,
                                  Map<Character, Integer> notVowelMap) {
        if (vowelSet.contains(c)) {
            if (existMap.containsKey(c)) {
                existMap.put(c, existMap.get(c) + 1);
            } else {
                existMap.put(c, 1);
            }
        } else {
            if (notVowelMap.containsKey(c)) {
                notVowelMap.put(c,
                        notVowelMap.get(c) + 1);
            } else {
                notVowelMap.put(c, 1);
            }
        }
    }
}
