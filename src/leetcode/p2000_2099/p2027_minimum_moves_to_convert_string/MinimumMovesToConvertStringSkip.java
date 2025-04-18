package leetcode.p2000_2099.p2027_minimum_moves_to_convert_string;

public class MinimumMovesToConvertStringSkip
        implements MinimumMovesToConvertString {
    @Override
    public int minimumMoves(String s) {
        int output = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'X') {
                output++;
                i += 2;
            }
        }
        return output;
    }
}
