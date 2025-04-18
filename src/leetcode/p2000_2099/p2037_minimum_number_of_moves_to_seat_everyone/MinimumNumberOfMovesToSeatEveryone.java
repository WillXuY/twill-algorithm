package leetcode.p2000_2099.p2037_minimum_number_of_moves_to_seat_everyone;

public interface MinimumNumberOfMovesToSeatEveryone {
    /**
     * There are n seats and n students in a room. You are given an
     * array seats of length n, where seats[i] is the position of the
     * ith seat. You are also given the array students of length n,
     * where students[j] is the position of the jth student.
     * <p>
     * You may perform the following move any number of times:
     * <p>
     * - Increase or decrease the position of the ith student by 1
     *   (i.e., moving the ith student from position x to x + 1 or x - 1)
     * <p>
     * Return the minimum number of moves required to move each student
     * to a seat such that no two students are in the same seat.
     * <p>
     * Note that there may be multiple seats or students in the same
     * position at the beginning.
     *
     * @param seats,student n == seats.length == students.length
     *                      1 <= n <= 100
     *                      1 <= seats[i], students[j] <= 100
     */
    int minMovesToSeat(int[] seats, int[] students);
}
