/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface MinCostClimbingStairs {
    /**
     * You are given an integer array cost where cost[i] is the cost of
     * i^th step on a staircase. Once you pay the cost, you can either
     * climb one or two steps.
     * You can either start from the step with index 0, or the step with
     * index 1.
     * Return the minimum cost to reach the top of the floor.
     *
     * @param cost 2 <= cost.length <= 1000
     *             0 <= cost[i] <= 999
     * @return the min cost of climbing stairs.
     */
    int minCostClimbingStairs(int[] cost);
}
