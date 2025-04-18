package leetcode.p1700_1799.p1732_find_the_highest_altitude;

public class FindTheHighestAltitudeLoop implements FindTheHighestAltitude {
    @Override
    public int largestAltitude(int[] gain) {
        int output = 0;
        int count = 0;
        for (int g: gain) {
            count += g;
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
