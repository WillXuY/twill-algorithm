package leetcode.p0700_0799.p0731_my_calendar_ii;

public class MyCalendarIiArray implements MyCalendarIi {
    private int[] dailyEvents = new int[10];

    @Override
    public boolean book(int start, int end) {
        if (end >= dailyEvents.length) {
            int[] newDailyEvents = new int[end + 1];
            System.arraycopy(dailyEvents, 0,
                    newDailyEvents, 0, dailyEvents.length);
            dailyEvents = newDailyEvents;
        }
        for (int i = start; i < end; i++) {
            if (dailyEvents[i] > 1) {
                return false;
            }
        }
        for (int i = start; i < end; i++) {
            dailyEvents[i]++;
        }
        return true;
    }
}
