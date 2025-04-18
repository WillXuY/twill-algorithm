/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0657_robot_return_to_origin;

public class RobotReturnToOriginCount implements RobotReturnToOrigin {
    @Override
    public boolean judgeCircle(String moves) {
        int left = 0;
        int up = 0;
        for (char c: moves.toCharArray()) {
            switch (c) {
                case 'L' -> left++;
                case 'R' -> left--;
                case 'U' -> up++;
                case 'D' -> up--;
                default -> {
                }
            }
        }
        return left == 0 && up == 0;
    }
}
