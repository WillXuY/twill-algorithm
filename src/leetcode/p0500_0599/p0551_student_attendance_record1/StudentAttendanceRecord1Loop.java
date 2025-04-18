package leetcode.p0500_0599.p0551_student_attendance_record1;

public class StudentAttendanceRecord1Loop implements StudentAttendanceRecord1 {
    @Override
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for (char c: s.toCharArray()) {
            if ('A' == c) {
                countA++;
                if (countA > 1) {
                    return false;
                }
                countL = 0;
            } else if ('L' == c) {
                countL++;
                if (countL > 2) {
                    return false;
                }
            } else {
                countL = 0;
            }
        }
        return true;
    }
}
