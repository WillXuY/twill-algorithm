package org.willxu.algorithm.domain.integer;

/**
 * There is an exam room with n seats in a single row labeled from 0 to
 * n - 1.
 * <p>
 * When a student enters the room, they must sit in the seat that
 * maximizes the distance to the closest person. If there are multiple
 * such seats, they sit in the seat with the lowest number. If no one is
 * in the room, then the student sits at seat number 0.
 * <p>
 * Design a class that simulates the mentioned exam room.
 * <p>
 * Implement the ExamRoom class:
 * <p>
 * - ExamRoom(int n) Initializes the object of the exam room with the
 *   number of the seats n.
 * <p>
 * 1 <= n <= 10^9
 * At most 10^4 calls will be made to seat and leave.
 */
public interface ExamRoom {
    /**
     * @return the label of the seat at which the next student will set.
     */
    int seat();

    /**
     * Indicates that the student sitting at seat p will leave the room.
     * It is guaranteed that there will be a student sitting at seat p.
     *
     * @param p It is guaranteed that there is a student sitting at
     *          seat p.
     */
    void leave(int p);
}
