package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.FindResultantArrayAfterRemovingAnagrams;

import java.util.*;

public class FindResultantArrayAfterRemovingAnagramsSort
        implements FindResultantArrayAfterRemovingAnagrams {
    @Override
    public List<String> removeAnagrams(String[] words) {
        List<String> output = new ArrayList<>();
        String lastOne = "-";
        for (String w: words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!lastOne.equals(sorted)) {
                output.add(w);
            }
            lastOne = sorted;
        }
        return output;
    }
}
