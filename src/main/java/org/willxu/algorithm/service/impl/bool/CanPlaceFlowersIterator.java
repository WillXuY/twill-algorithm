/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CanPlaceFlowers;

public class CanPlaceFlowersIterator implements CanPlaceFlowers {
    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0;
        }
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0
                        && flowerbed[i + 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
}
