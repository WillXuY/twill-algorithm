/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.ArrayPartition1;

public class ArrayPartition1Order implements ArrayPartition1 {
    @Override
    public int arrayPairSum(int[] nums) {
        int[] orderIndex = new int[nums.length];
        orderIndex[0] = 0;
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < length; j++) {
                int order = orderIndex[j];
                if (nums[i] > nums[order]) {
                    // insert i into orderIndex at orderIndex[j].
                    int[] newOrder = new int[nums.length];
                    System.arraycopy(orderIndex, 0, newOrder, 0, j);
                    newOrder[j] = i;
                    System.arraycopy(orderIndex, j, newOrder, j + 1, length - j);
                    orderIndex = newOrder;
                    length++;
                    break;
                }
            }
            // Haven't insert i yet.
            if (length == i) {
                orderIndex[length] = i;
                length++;
            }
        }
        int sum = 0;
        for (int i = 1; i < orderIndex.length; i += 2) {
            sum += nums[orderIndex[i]];
        }
        return sum;
    }
}
