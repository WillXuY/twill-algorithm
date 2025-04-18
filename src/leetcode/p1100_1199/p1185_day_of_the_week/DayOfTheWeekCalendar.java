package leetcode.p1100_1199.p1185_day_of_the_week;

import java.util.Calendar;

public class DayOfTheWeekCalendar implements DayOfTheWeek {
    @Override
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        String[] weekStrings = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        int dayOfWeekIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        return weekStrings[dayOfWeekIndex];
    }
}
