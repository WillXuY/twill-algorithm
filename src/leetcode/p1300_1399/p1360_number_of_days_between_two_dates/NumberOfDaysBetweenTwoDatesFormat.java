package leetcode.p1300_1399.p1360_number_of_days_between_two_dates;

import java.text.SimpleDateFormat;

public class NumberOfDaysBetweenTwoDatesFormat implements NumberOfDaysBetweenTwoDates {
    @Override
    public int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Long ms1 = sdf.parse(date1).getTime();
            Long ms2 = sdf.parse(date2).getTime();
            return Math.abs((int) ((ms1 - ms2) / 1000 / 3600 / 24));
        } catch (Exception e) {
            return -1;
        }
    }
}
