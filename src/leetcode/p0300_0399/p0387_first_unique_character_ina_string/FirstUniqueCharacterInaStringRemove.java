package leetcode.p0300_0399.p0387_first_unique_character_ina_string;

import java.util.TreeMap;
import java.util.TreeSet;

public class FirstUniqueCharacterInaStringRemove
        implements FirstUniqueCharacterInaString {
    @Override
    public int firstUniqChar(String s) {
        TreeMap<Character, Integer> unique = new TreeMap<>();
        TreeSet<Integer> indexList = new TreeSet<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character c = chars[i];
            if (unique.containsKey(c)) {
                int index = unique.get(c);
                if (index != -1) {
                    indexList.remove(index);
                    unique.put(c, -1);
                }
            } else {
                unique.put(c, i);
                indexList.add(i);
            }
        }
        if (indexList.size() > 0) {
            return indexList.first();
        }
        return -1;
    }
}
