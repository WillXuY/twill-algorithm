package leetcode.p1700_1799.p1732_find_the_highest_altitude;

public interface FindTheHighestAltitude {
    /**
     * There is a biker going on a road trip. The road trip consists of
     * n + 1 points at different altitudes. The biker starts his trip on
     * point 0 with altitude equal 0.
     *
     * You are given an integer array gain of length n where gain[i] is
     * the net gain in altitude between points i and i + 1 for all
     * (0 <= i < n). Return the highest altitude of a point.
     *
     * @param gain n == gain.length
     *             1 <= n <= 100
     *             -100 <= gain[i] <= 100
     */
    int largestAltitude(int[] gain);
}
