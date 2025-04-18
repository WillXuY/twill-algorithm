package leetcode.p1700_1799.p1700_number_of_students_unable_to_eat_lunch;

public class NumberOfStudentsUnableToEatLunchCount
        implements NumberOfStudentsUnableToEatLunch {
    @Override
    public int countStudents(int[] students, int[] sandwiches) {
        int count1 = 0;
        for (int i: students) {
            if (i == 1) {
                count1++;
            }
        }
        int count0 = students.length - count1;
        int need1 = 0;
        int need0 = 0;
        for (int i: sandwiches) {
            if (i == 1) {
                need1++;
            } else {
                need0++;
            }
            if (need1 > count1) {
                return sandwiches.length + 1 - need1 - need0;
            } else if (need0 > count0) {
                return sandwiches.length + 1 - need1 - need0;
            }
        }
        return 0;
    }
}
