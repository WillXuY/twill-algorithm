/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface CanPlaceFlowers {
    /**
     * You have a long flowerbed in which some of the plots are planted,
     * and some are not. However, flowers cannot be planted in adjacent
     * plots.
     * Given an integer array flowerbed containing 0's and 1's, where 0
     * means empty and 1 means not empty, and an integer n, return if n
     * new flowers can be planted in the flowerbed without violating the
     * no-adjacent-flowers rule.
     *
     * @param flowerbed 1 <= flowerbed.length <= 2 * 10^4
     *                  flowerbed[i] is 0 or 1.
     *                  There are no two adjacent flowers in flowerbed.
     * @param n 0 <= n <= flowerbed.length
     * @return can place flowers in flowerbed or not.
     */
    boolean canPlaceFlowers(int[] flowerbed, int n);
}
