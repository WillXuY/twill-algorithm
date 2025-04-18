/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0300_0399.p0312_burst_balloons;

/**
 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a
 * number on it represented by array nums. You are asked to burst all the
 * balloons. If the you burst balloon i you will get
 * nums[left] * nums[i] * nums[right] coins. Here left and right are
 * adjacent indices of i. After the burst, the left and right then becomes
 * adjacent.
 * Find the maximum coins you can collect by bursting the balloons wisely.
 * Note:
 * - You may imagine nums[-1] = nums[n] = 1. They are not real therefore
 *   you can not burst them.
 * - 0<= n <= 500, 0 <= nums[i] <= 100.
 */
public interface BurstBalloons {
    int maxCoins(int[] nums);
}
