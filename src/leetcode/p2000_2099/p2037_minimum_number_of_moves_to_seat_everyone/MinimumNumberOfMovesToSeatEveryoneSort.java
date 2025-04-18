package leetcode.p2000_2099.p2037_minimum_number_of_moves_to_seat_everyone;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryoneSort
        implements MinimumNumberOfMovesToSeatEveryone {
    @Override
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int output = 0;
        for (int i = 0; i < seats.length; i++) {
            output += Math.abs(seats[i] - students[i]);
        }
        return output;
    }
}
