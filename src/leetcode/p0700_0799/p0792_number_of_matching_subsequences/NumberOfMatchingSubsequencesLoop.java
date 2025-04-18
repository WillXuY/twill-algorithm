package leetcode.p0700_0799.p0792_number_of_matching_subsequences;

import java.util.HashSet;
import java.util.Set;

public class NumberOfMatchingSubsequencesLoop
        implements NumberOfMatchingSubsequences {
    @Override
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        Set<String> matchSet = new HashSet<>();
        Set<String> notMatchSet = new HashSet<>();
        for (String w: words) {
            if (matchSet.contains(w)) {
                result++;
                continue;
            }
            if (notMatchSet.contains(w)) {
                continue;
            }
            if (matchingSubsequences(s, w)) {
                matchSet.add(w);
                result++;
            } else {
                notMatchSet.add(w);
            }
        }
        return result;
    }

    private boolean matchingSubsequences(String string, String regex) {
        int indexRegex = 0;
        char[] charsRegex = regex.toCharArray();
        for (char c: string.toCharArray()) {
            if (c == charsRegex[indexRegex]) {
                indexRegex++;
                if (indexRegex >= regex.length()) {
                    return true;
                }
            }
        }
        return false;
    }
}
