package org.willxu.algorithm.service.impl.string;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * wrong answer it return longest common sub string
 */
public class LongestCommonSubStringBruteForce {
    public String longestCommonSubString(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        TreeMap<String, Integer> subs = new TreeMap<>();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = i; j <= strs[0].length(); j++) {
                String sub = strs[0].substring(i, j);
                subs.put(sub, sub.length());
            }
        }
        for (int i = 1; i < strs.length; i++) {
            String test = strs[i];
            Iterator<Map.Entry<String, Integer>> iterator =
                    subs.entrySet().iterator();
            while (iterator.hasNext()) {
                String k = iterator.next().getKey();
                if (!test.contains(k)) {
                    iterator.remove();
                }
            }
        }
        boolean isFirst = true;
        String result = "";
        for (String k: subs.keySet()) {
            if (isFirst) {
                result = k;
                isFirst = false;
            }
            if (subs.get(k) > subs.get(result)) {
                result = k;
            }
        }
        return result;
    }
}
