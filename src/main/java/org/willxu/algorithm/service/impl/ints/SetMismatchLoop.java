/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.SetMismatch;

public class SetMismatchLoop implements SetMismatch {
    @Override
    public int[] findErrorNums(int[] nums) {
        boolean[] exits = new boolean[nums.length + 1];
        int[] output = new int[2];
        for (int i: nums) {
            if (exits[i]) {
                output[0] = i;
            } else {
                exits[i] = true;
            }
        }
        for (int i = 1; i < exits.length; i++) {
            if (!exits[i] && i != output[0]) {
                output[1] = i;
            }
        }
        if (output[1] == 0) {
            output[1] = exits.length;
        }
        return output;
    }
}
