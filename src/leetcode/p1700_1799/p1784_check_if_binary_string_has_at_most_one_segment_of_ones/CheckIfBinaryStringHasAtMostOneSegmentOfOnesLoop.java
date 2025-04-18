package leetcode.p1700_1799.p1784_check_if_binary_string_has_at_most_one_segment_of_ones;

public class CheckIfBinaryStringHasAtMostOneSegmentOfOnesLoop
        implements CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
    @Override
    public boolean checkOnesSegment(String s) {
        char[] chars = s.toCharArray();
        boolean lastIsOne = false;
        boolean oneAppeared = false;
        for (char c: chars) {
            if (c == '1') {
                if (oneAppeared) {
                    return false;
                }
                lastIsOne = true;
            } else {
                if (lastIsOne) {
                    oneAppeared = true;
                }
                lastIsOne = false;
            }
        }
        return true;
    }
}
