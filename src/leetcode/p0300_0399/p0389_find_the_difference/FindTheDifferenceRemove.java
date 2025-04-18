package leetcode.p0300_0399.p0389_find_the_difference;

import java.util.HashMap;

public class FindTheDifferenceRemove implements FindTheDifference {
    @Override
    public char findTheDifference(String s, String t) {
        // todo extract method from the duplicate code
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (Character c: s.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }
        for (Character c: t.toCharArray()) {
            if (charMap.containsKey(c)) {
                int count = charMap.get(c);
                if (count == 0) {
                    return c;
                }
                charMap.put(c, count - 1);
            } else {
                return c;
            }
        }
        return 0;
    }
}
