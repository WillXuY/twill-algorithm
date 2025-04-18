package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.GroupAnagrams;

import java.util.*;

public class GroupAnagramsHash implements GroupAnagrams {
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (result.containsKey(key)) {
                result.get(key).add(s);
            } else {
                List<String> words = new ArrayList<>();
                words.add(s);
                result.put(key, words);
            }
        }
        return new ArrayList<>(result.values());
    }
}
