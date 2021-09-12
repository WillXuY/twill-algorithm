package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.LongestPalindrome;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromeCount implements LongestPalindrome {
    @Override
    public int longestPalindrome(String s) {
        int count = 0;
        Set<Character> singleCharSet = new HashSet<>();
        for (Character c: s.toCharArray()) {
            if (singleCharSet.contains(c)) {
                singleCharSet.remove(c);
                count += 2;
            } else {
                singleCharSet.add(c);
            }
        }
        if (singleCharSet.size() > 0) {
            count++;
        }
        return count;
    }
}
