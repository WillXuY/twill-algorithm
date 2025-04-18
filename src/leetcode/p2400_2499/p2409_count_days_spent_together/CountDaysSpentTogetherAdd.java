package leetcode.p2400_2499.p2409_count_days_spent_together;

public class CountDaysSpentTogetherAdd implements CountDaysSpentTogether {
    @Override
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {
        int dateAa = getDate(arriveAlice);
        int dateLa = getDate(leaveAlice);
        int dateAb = getDate(arriveBob);
        int dateLb = getDate(leaveBob);
        int arriveBoth = Math.max(dateAa, dateAb);
        int leaveFirst = Math.min(dateLa, dateLb);
        return Math.max(0, leaveFirst - arriveBoth + 1);
    }

    private int getDate(String dateTime) {
        int[] days = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] time = dateTime.split("-");
        int month = Integer.parseInt(time[0]);
        int output = 0;
        for (int i = 0; i < month - 1; i++) {
            output += days[i];
        }
        output += Integer.parseInt(time[1]);
        return output;
    }
}
