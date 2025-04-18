package leetcode.p2200_2299.p2299_strong_password_checker_ii;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrongPasswordCheckerIiLoop implements StrongPasswordCheckerIi {
    @Override
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean containsLowercase = false;
        boolean containsUppercase = false;
        boolean containsDigit = false;
        boolean containsSpecial = false;
        Set<Character> specialSet = Stream.of(
                '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'
        ).collect(Collectors.toSet());
        char lastChar = ' ';
        for (char c: password.toCharArray()) {
            if (lastChar == c) {
                return false;
            } else {
                lastChar = c;
            }
            if ('a' <= c && c <= 'z') {
                containsLowercase = true;
            } else if ('A' <= c && c <= 'Z') {
                containsUppercase = true;
            } else if ('0' <= c && c <= '9') {
                containsDigit = true;
            } else if (specialSet.contains(c)) {
                containsSpecial = true;
            }
        }
        return containsLowercase && containsUppercase
                && containsDigit && containsSpecial;
    }
}
