package leetcode.p0700_0799.p0792_number_of_matching_subsequences;

public class NumberOfMatchingSubsequencesRegex
        implements NumberOfMatchingSubsequences {
    @Override
    public int numMatchingSubseq(String s, String[] words) {
        int result = 0;
        for (String w: words) {
            String format = getFormat(w);
            if (s.matches(format)) {
                result++;
            }
        }
        return result;
    }

    private String getFormat(String w) {
        StringBuilder result = new StringBuilder();
        for (char c: w.toCharArray()) {
            result.append(".*");
            result.append(c);
        }
        result.append(".*");
        return result.toString();
    }
}
