/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p1500_1599.p1552_magnetic_force_between_two_balls;

public interface MagneticForceBetweenTwoBallsService {
    /**
     * In universe Earth C-137, Rick discovered a special form of magnetic
     * force between two balls if they are put in his new invented basket.
     * Rick has n empty baskets, the i^th basket is at position[i], Morty
     * has m balls and needs to distribute the balls into the baskets such
     * that the minimum magnetic force between any two balls is maximum.
     * Rick stated that magnetic force between two different balls at positions
     * x and y is |x - y|.
     * Given the integer array position and the integer m. Return the required
     * force.
     */
    int getMagneticForceBetweenTwoBalls(int[] position, int m);
}
