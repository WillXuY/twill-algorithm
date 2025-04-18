package leetcode.p0200_0299.p0290_word_pattern;

import java.util.*;

public class WordPatternMap implements WordPattern {

    @Override
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        List<String> wordList = Arrays.asList(words);
        char[] patterns = pattern.toCharArray();
        Map<Character, String> map = new HashMap<>();
        HashSet<String> exit = new HashSet<>();
        if (patterns.length != wordList.size()) {
            return false;
        }
        for (int i = 0; i < patterns.length; i++) {
            Character c = patterns[i];
            String word = wordList.get(i);
            if (!map.containsKey(c)) {
                if (exit.contains(word)) {
                    return false;
                }
                map.put(c, word);
                exit.add(word);
            } else if (!word.equals(map.get(c))) {
                return false;
            }
        }
        return true;
    }
}
