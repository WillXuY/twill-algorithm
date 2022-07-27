package org.willxu.algorithm.service.integer;

public interface MaximumPopulationYear {
    /**
     * You are given a 2D integer array logs where each logs[i] =
     * [birth_i, death_i] indicates the birth and death years of the ith
     * person.
     *
     * The population of some year x is the number of people alive
     * during that year. The ith person is counted in year x's
     * population if x is in the inclusive range [birth_i, death_i - 1].
     * Note that the person is not counted in the year that they die.
     *
     * Return the earliest year with the maximum population.
     *
     * @param logs 1 <= logs.length <= 100
     *             1950 <= birthi < deathi <= 2050
     */
    int maximumPopulation(int[][] logs);
}
