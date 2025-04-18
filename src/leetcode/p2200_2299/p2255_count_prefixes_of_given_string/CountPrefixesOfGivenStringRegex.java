package leetcode.p2200_2299.p2255_count_prefixes_of_given_string;

public class CountPrefixesOfGivenStringRegex
        implements CountPrefixesOfGivenString {
    @Override
    public int countPrefixes(String[] words, String s) {
        int output = 0;
        for (String w: words) {
            String regex = "^" + w + ".*";
            if ("".equals(s.replaceAll(regex, ""))) {
                output++;
            }
        }
        return output;
    }
}
