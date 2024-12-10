package org.willxu.algorithm.service.integer;

public interface CinemaSeatAllocation {
    /**
     * A cinema has n rows of seats, numbered from 1 to n and there are
     * ten seats in each row, labelled from 1 to 10 as shown in the
     * figure above.
     * <p>
     * Given the array reservedSeats containing the numbers of seats
     * already reserved, for example, reservedSeats[i] = [3,8] means the
     * seat located in row 3 and labelled with 8 is already reserved.
     * <p>
     * Return the maximum number of four-person groups you can assign on
     * the cinema seats. A four-person group occupies four adjacent
     * seats in one single row. Seats across an aisle (such as [3,3] and
     * [3,4]) are not considered to be adjacent, but there is an
     * exceptional case on which an aisle split a four-person group, in
     * that case, the aisle split a four-person group in the middle,
     * which means to have two people on each side.
     *
     * @param n 1 <= n <= 10^9
     * @param reservedSeats 1 <= reservedSeats.length <= min(10*n, 10^4)
     *                      reservedSeats[i].length == 2
     *                      1 <= reservedSeats[i][0] <= n
     *                      1 <= reservedSeats[i][1] <= 10
     *                      All reservedSeats[i] are distinct.
     */
    int maxNumberOfFamilies(int n, int[][] reservedSeats);
}
