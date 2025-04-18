package leetcode.p1700_1799.p1763_longest_nice_substring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestNiceSubstringSet implements LongestNiceSubstring {
    @Override
    public String longestNiceSubstring(String s) {
        List<String> sList = new ArrayList<>();
        sList.add(s);
        List<String> niceList = splitByBad(sList);
        int length = 0;
        String output = "";
        for (String n: niceList) {
            if (n.length() > length) {
                output = n;
                length = n.length();
            }
        }
        return output;
    }

    public List<String> splitByBad(List<String> strList) {
        boolean allNice = true;
        List<String> output = new ArrayList<>();
        for (String s: strList) {
            Set<Character> badSet = getBadSet(s);
            StringBuilder sb = new StringBuilder();
            for (char c: s.toCharArray()) {
                if (badSet.contains(c)) {
                    allNice = false;
                    if (sb.length() != 0) {
                        output.add(sb.toString());
                        sb = new StringBuilder();
                    }
                } else {
                    sb.append(c);
                }
            }
            if (sb.length() > 0) {
                output.add(sb.toString());
            }
        }
        if (allNice) {
            return output;
        } else {
            return splitByBad(output);
        }
    }

    public Set<Character> getBadSet(String s) {
        Set<Character> badSet = new HashSet<>();
        Set<Character> niceSet = new HashSet<>();
        for (char c: s.toCharArray()) {
            if (niceSet.contains(c)) {
                continue;
            }
            char upperOrLower;
            if ('A' <= c && c <= 'Z') {
                upperOrLower = (char)(c + 32);
            } else {
                upperOrLower = (char)(c - 32);
            }
            if (badSet.contains(upperOrLower)) {
                niceSet.add(c);
                niceSet.add(upperOrLower);
                badSet.remove(upperOrLower);
            } else {
                badSet.add(c);
            }
        }
        return badSet;
    }
}
