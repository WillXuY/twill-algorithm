package leetcode.p0500_0599.p0524_longest_word_in_dictionary_through_deleting;

import java.util.List;
import java.util.TreeSet;

public class LongestWordInDictionaryThroughDeletingMap
        implements LongestWordInDictionaryThroughDeleting {
    @Override
    public String findLongestWord(String s, List<String> dictionary) {
        TreeSet<String> result = new TreeSet<>();
        int[] indexes = new int[dictionary.size()];
        for (char c: s.toCharArray()) {
            for (int i = 0; i < indexes.length; i++) {
                String d = dictionary.get(i);
                if (indexes[i] >= d.length()) {
                    continue;
                }
                if (d.charAt(indexes[i]) == c) {
                    indexes[i]++;
                    if (indexes[i] >= d.length()) {
                        result.add(d);
                    }
                }
            }
        }
        int len = 0;
        String longest = "";
        for (String r: result) {
            if (r.length() > len) {
                len = r.length();
                longest = r;
            }
        }
        return longest;
    }
}
