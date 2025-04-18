package leetcode.p1500_1599.p1507_reformat_date;

import java.util.HashMap;
import java.util.Map;

public class ReformatDateMap implements ReformatDate {
    @Override
    public String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
        String[] splitDate = date.split(" ");
        String dateStr = splitDate[0].replaceAll("\\D*", "");
        if (dateStr.length() == 1) {
            dateStr = "0" + dateStr;
        }
        return splitDate[2] + "-" + monthMap.get(splitDate[1]) + "-" + dateStr;
    }
}
