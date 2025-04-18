package leetcode.p1300_1399.p1344_angle_between_hands_of_clock;

public class AngleBetweenHandsOfClockCalculate
        implements AngleBetweenHandsOfClock {
    @Override
    public double angleClock(int hour, int minutes) {
        hour = hour % 12;
        double angleHour = minutes / 2.0 + hour * 30;
        double angleMinutes = minutes * 6.0;
        double diff = Math.abs(angleHour - angleMinutes);
        if (diff > 180) {
            diff = 360 - diff;
        }
        return diff;
    }
}
