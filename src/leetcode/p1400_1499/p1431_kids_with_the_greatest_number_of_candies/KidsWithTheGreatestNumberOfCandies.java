package leetcode.p1400_1499.p1431_kids_with_the_greatest_number_of_candies;

import java.util.List;

public interface KidsWithTheGreatestNumberOfCandies {
    /**
     * There are n kids with candies. You are given an integer array
     * candies, where each candies[i] represents the number of candies
     * the i^th kid has, and an integer extraCandies, denoting the
     * number of extra candies that you have.
     * Return a boolean array result of length n, where result[i] is
     * true if, after giving the i^th kid all the extraCandies, they
     * will have the greatest number of candies among all the kids, or
     * false otherwise.
     * Note that multiple kids can have the greatest number of candies.
     *
     * @param candies 2 <= candies.length <= 100
     *                1 <= candies[i] <= 100
     * @param extraCandies 1 <= extraCandies <= 50
     * @return kids get extra candies will have the greatest number.
     */
    List<Boolean> kidsWithCandies(int[] candies, int extraCandies);
}
