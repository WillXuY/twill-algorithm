package leetcode.p1100_1199.p1154_day_of_the_year;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DayOfTheYearFormat implements DayOfTheYear {
    @Override
    public int dayOfYear(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            long l =  sdf.parse(date).getTime();
            String firstDayOfYear = date.replaceAll(
                    "-\\d{2}-\\d{2}", "-01-01");
            long start = sdf.parse(firstDayOfYear).getTime();
            long output = (l - start) / 1000 / 3600 / 24;
            return (int) output + 1;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
