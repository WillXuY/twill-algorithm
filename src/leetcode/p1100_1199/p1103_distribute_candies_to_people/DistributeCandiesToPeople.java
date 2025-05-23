package leetcode.p1100_1199.p1103_distribute_candies_to_people;

public interface DistributeCandiesToPeople {
    /**
     * We distribute some number of candies, to a row of n = num_people
     * people in the following way:
     * We then given 1 candy to the first person, 2 candies to the
     * second person, and so on until we give n candies to the last
     * person.
     * Then, we go back to the start of the row, giving n + 1 candies to
     * the first person, n + 2 candies to the second person, and so on
     * until we give 2 * n candies to the last person.
     * This process repeats (with us giving one more candy each time,
     * and moving to the start of the row after we reach the end) until
     * we run out of candies. The last person will receive all of out
     * remaining candies (not necessarily one more than the previous
     * gift).
     * Return an array (of length num_people, and sum candies) that
     * represents the final distribution of candies.
     *
     * @param candies 1 <= candies <= 10^9
     * @param num_people 1 <= num_people <= 1000
     * @return the candies people receive.
     */
    int[] distributeCandies(int candies, int num_people);
}
