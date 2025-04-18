package leetcode.p2300_2399.p2315_count_asterisks;

public class CountAsterisksLoop implements CountAsterisks {
    @Override
    public int countAsterisks(String s) {
        int output = 0;
        boolean include = true;
        for (char c: s.toCharArray()) {
            if ('|' == c) {
                include = !include;
                continue;
            }
            if (include && '*' == c) {
                output++;
            }
        }
        return output;
    }
}
