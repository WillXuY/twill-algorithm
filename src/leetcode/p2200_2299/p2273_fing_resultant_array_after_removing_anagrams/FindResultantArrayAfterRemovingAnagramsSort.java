package leetcode.p2200_2299.p2273_fing_resultant_array_after_removing_anagrams;

import java.util.*;

public class FindResultantArrayAfterRemovingAnagramsSort
        implements FindResultantArrayAfterRemovingAnagrams {
    @Override
    public List<String> removeAnagrams(String[] words) {
        List<String> output = new ArrayList<>();
        String lastOne = "-";
        for (String w: words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!lastOne.equals(sorted)) {
                output.add(w);
            }
            lastOne = sorted;
        }
        return output;
    }
}
