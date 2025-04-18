package leetcode.p0100_0199.p0139_word_break;

import java.util.List;

public class WordBreakRecursive implements WordBreak {
    @Override
    public boolean wordBreak(String s, List<String> wordDict) {
        for (String word: wordDict) {
            String regex = "^" + word + ".*";
            if (s.equals(word)) {
                return true;
            }
            if (!s.matches(regex)) {
                continue;
            }
            String sub = s.replaceFirst(word, "");
            if (wordBreak(sub, wordDict)) {
                return true;
            }
        }
        return false;
    }
}
