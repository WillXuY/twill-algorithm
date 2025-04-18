package leetcode.p1700_1799.p1736_latest_time_by_replacing_hidden_digits;

public class LatestTimeByReplacingHiddenDigitsStep
        implements LatestTimeByReplacingHiddenDigits {
    @Override
    public String maximumTime(String time) {
        char[] chars = time.toCharArray();
        if (chars[0] == '?') {
            chars[0] = switch (chars[1]) {
                case '0', '1', '2', '3', '?' -> '2';
                default -> '1';
            };
        }
        if (chars[1] == '?') {
            if (chars[0] == '2') {
                chars[1] = '3';
            } else {
                chars[1] = '9';
            }
        }
        if (chars[3] == '?') {
            chars[3] = '5';
        }
        if (chars[4] == '?') {
            chars[4] = '9';
        }
        return new String(chars);
    }
}
