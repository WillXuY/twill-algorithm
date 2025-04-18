package leetcode.p0400_0499.p0434_number_of_segments_ina_string;

public class NumberOfSegmentsInaStringSpace
        implements NumberOfSegmentsInaString {
    @Override
    public int countSegments(String s) {
        char space = ' ';
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        boolean lastSpace = true;
        for (char c: s.toCharArray()) {
            if (c == space) {
                lastSpace = true;
            } else {
                if (lastSpace) {
                    count++;
                }
                lastSpace = false;
            }
        }
        return count;
    }
}
