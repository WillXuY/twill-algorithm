package org.willxu.algorithm.service.bool;

public interface StudentAttendanceRecord1 {
    /**
     * You are given a string s representing an attendance record for a
     * student where each character signifies whether the student was
     * absent, late, or present on that day. The record only contains
     * the following three characters:
     * - 'A': Absent.
     * - 'L': Late.
     * - 'P': Present.
     * The student is eligible for an attendance award if they meet both
     * of teh following criteria:
     * - The student was absent('A') for strictly fewer than 2 days
     *   total.
     * - The student was never late('L') for 3 or more consecutive days.
     * Return true if teh student is eligible for an attendance award,
     * or false otherwise.
     *
     * @param s 1 <= s.length <= 1000
     *          s[i] is either 'A', 'L', or 'P'.
     * @return pass.
     */
    boolean checkRecord(String s);
}
