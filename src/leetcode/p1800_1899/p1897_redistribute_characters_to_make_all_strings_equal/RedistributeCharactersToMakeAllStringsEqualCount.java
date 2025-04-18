package leetcode.p1800_1899.p1897_redistribute_characters_to_make_all_strings_equal;

import java.util.HashMap;
import java.util.Map;

public class RedistributeCharactersToMakeAllStringsEqualCount
        implements RedistributeCharactersToMakeAllStringsEqual {
    @Override
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> count = new HashMap<>();
        for (String word: words) {
            for (char w: word.toCharArray()) {
                if (count.containsKey(w)) {
                    count.put(w, count.get(w) + 1);
                } else {
                    count.put(w, 1);
                }
            }
        }
        for (int i: count.values()) {
            if (i % words.length != 0) {
                return false;
            }
        }
        return true;
    }
}
