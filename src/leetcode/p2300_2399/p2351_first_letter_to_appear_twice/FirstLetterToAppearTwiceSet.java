package leetcode.p2300_2399.p2351_first_letter_to_appear_twice;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwiceSet
        implements FirstLetterToAppearTwice {
    @Override
    public char repeatedCharacter(String s) {
        Set<Character> set = new HashSet<>();
        for (char c: s.toCharArray()) {
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }
        return 0;
    }
}
