package leetcode.p0000_0099.p0091_decode_ways;

import java.util.Arrays;

public class DecodeWaysRecursive implements DecodeWays {
    @Override
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        if (chars.length == 0) {
            return 1;
        }
        if (chars[0] == '0') {
            return 0;
        }
        if (chars.length == 1) {
            return 1;
        }
        boolean single = chars[0] > '2'
                || (chars[0] == '2' && chars[1] > '6');
        if (single) {
            char[] sub = Arrays.copyOfRange(chars, 1, chars.length);
            return numDecodings(new String(sub));
        } else {
            char[] sub1 = Arrays.copyOfRange(chars, 1, chars.length);
            int output1 = numDecodings(new String(sub1));
            char[] sub2 = Arrays.copyOfRange(chars, 2, chars.length);
            int output2 = numDecodings(new String(sub2));
            return output1 + output2;
        }
    }
}
