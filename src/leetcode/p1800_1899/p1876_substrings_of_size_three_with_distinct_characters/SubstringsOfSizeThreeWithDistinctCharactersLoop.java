package leetcode.p1800_1899.p1876_substrings_of_size_three_with_distinct_characters;

public class SubstringsOfSizeThreeWithDistinctCharactersLoop
        implements SubstringsOfSizeThreeWithDistinctCharacters {
    @Override
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
        char[] chars = s.toCharArray();
        char first = chars[0];
        char second = chars[1];
        int output = 0;
        for (int i = 2; i < s.length(); i++) {
            if (chars[i] != first && chars[i] != second && first != second) {
                output++;
            }
            first = second;
            second = chars[i];
        }
        return output;
    }
}
