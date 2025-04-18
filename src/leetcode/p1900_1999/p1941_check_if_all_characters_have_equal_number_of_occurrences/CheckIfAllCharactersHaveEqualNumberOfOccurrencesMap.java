package leetcode.p1900_1999.p1941_check_if_all_characters_have_equal_number_of_occurrences;

import java.util.HashMap;
import java.util.Map;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesMap
        implements CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    @Override
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = -1;
        for (int i: map.values()) {
            if (count == -1) {
                count = i;
            } else if (count != i) {
                return false;
            }
        }
        return true;
    }
}
