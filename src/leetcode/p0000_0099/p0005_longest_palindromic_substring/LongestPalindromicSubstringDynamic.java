package leetcode.p0000_0099.p0005_longest_palindromic_substring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPalindromicSubstringDynamic
        implements LongestPalindromicSubstring {
    @Override
    public String longestPalindrome(String s) {
        Map<Integer, List<Integer>> lengthIndexList = new HashMap<>();
        int maxLength = 1;
        int palindromeLength = 1;
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            indexList.add(i);
        }
        lengthIndexList.put(palindromeLength, indexList);
        char[] chars = s.toCharArray();
        palindromeLength = 2;
        indexList = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                indexList.add(i);
            }
        }
        if (indexList.size() > 0) {
            maxLength = palindromeLength;
            lengthIndexList.put(palindromeLength, indexList);
        }
        for (palindromeLength = 3; palindromeLength <= s.length();
             palindromeLength ++) {
            List<Integer> subIndexList =
                    lengthIndexList.get(palindromeLength - 2);
            indexList = new ArrayList<>();
            if (subIndexList == null || subIndexList.size() == 0) {
                continue;
            }
            for (int subIndex: subIndexList) {
                int startIndex = subIndex - 1;
                int endIndex = startIndex + palindromeLength - 1;
                if (startIndex < 0 || endIndex >= s.length()) {
                    continue;
                }
                if (chars[startIndex] == chars[endIndex]) {
                    indexList.add(startIndex);
                }
            }
            if (indexList.size() > 0) {
                maxLength = palindromeLength;
                lengthIndexList.put(palindromeLength, indexList);
            }
        }
        int index = lengthIndexList.get(maxLength).get(0);
        return s.substring(index, index + maxLength);
    }
}
