package leetcode.p0000_0099.p0091_decode_ways;

public class DecodeWaysArray implements DecodeWays {
    @Override
    public int numDecodings(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int[] sum = new int[s.length()];
        int firstNum = Integer.parseInt(s.substring(0, 1));
        if (firstNum == 0) {
            return 0;
        }
        sum[0] = 1;
        if (s.length() == 1) {
            return sum[0];
        }
        int singleNum = Integer.parseInt(s.substring(1, 2));
        int doubleNum = Integer.parseInt(s.substring(0, 2));
        if (singleNum > 0) {
            sum[1]++;
        }
        if (doubleNum > 9 && doubleNum < 27) {
            sum[1]++;
        }
        for (int i = 2; i < s.length(); i++) {
            int sin = Integer.parseInt(s.substring(i, i + 1));
            if (sin > 0) {
                sum[i] += sum[i - 1];
            }
            int dou = Integer.parseInt(s.substring(i - 1, i + 1));
            if (dou > 9 && dou < 27) {
                sum[i] += sum[i - 2];
            }
        }
        return sum[s.length() - 1];
    }
}
