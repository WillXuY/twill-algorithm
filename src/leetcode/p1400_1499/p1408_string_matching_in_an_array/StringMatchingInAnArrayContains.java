package leetcode.p1400_1499.p1408_string_matching_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArrayContains implements StringMatchingInAnArray {
    @Override
    public List<String> stringMatching(String[] words) {
        List<String> output = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j == i) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    output.add(words[i]);
                    break;
                }
            }
        }
        return output;
    }
}
