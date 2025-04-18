package leetcode.p2400_2499.p2437_number_of_valid_clock_times;

public class NumberOfValidClockTimesIf implements NumberOfValidClockTimes {
    @Override
    public int countTime(String time) {
        int output = 1;
        char[] chars = time.toCharArray();
        if (chars[3] == '?') {
            output *= 6;
        }
        if (chars[4] == '?') {
            output *= 10;
        }
        if (chars[0] == '?') {
            if (chars[1] == '?') {
                output *= 24;
            } else if (chars[1] > '3') {
                output *= 2;
            } else {
                output *= 3;
            }
        } else if (chars[1] == '?') {
            if (chars[0] < '2') {
                output *= 10;
            } else {
                output *= 4;
            }
        }
        return output;
    }
}
