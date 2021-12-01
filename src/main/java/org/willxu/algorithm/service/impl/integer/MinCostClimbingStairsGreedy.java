/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinCostClimbingStairs;

public class MinCostClimbingStairsGreedy implements MinCostClimbingStairs {
    /**
     * 1. If cost.length = 2.
     *   1) cost[0]
     *   2) cost[1]
     * 2. If cost.length = 3.
     *   1) cost[0] + cost[2];
     *   2) cost[1]
     * 3. If cost.length = 4.
     *   1) cost[0] + cost[2];
     *   2) cost[1] + ?step;
     * 4. If cost.length = 5;
     *
     * todo
     *
     * @param cost 2 <= cost.length <= 1000
     *             0 <= cost[i] <= 999
     * @return
     */
    @Override
    public int minCostClimbingStairs(int[] cost) {
        // todo why?
        int sum1 = cost[0];
        int sum2 = cost[1];
        int temp;
        for (int i = 2; i < cost.length; i++) {
            temp = sum2;
            sum2 = Math.min(sum1, sum2) + cost[i];
            sum1 = temp;
        }
        return Math.min(sum1, sum2);
    }
}
