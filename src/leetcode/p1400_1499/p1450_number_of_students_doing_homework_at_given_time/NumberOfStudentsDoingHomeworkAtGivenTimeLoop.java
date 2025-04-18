package leetcode.p1400_1499.p1450_number_of_students_doing_homework_at_given_time;

public class NumberOfStudentsDoingHomeworkAtGivenTimeLoop
        implements NumberOfStudentsDoingHomeworkAtGivenTime {
    @Override
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int output = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                output++;
            }
        }
        return output;
    }
}
