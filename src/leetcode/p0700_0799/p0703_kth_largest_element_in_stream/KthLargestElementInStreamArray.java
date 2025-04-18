/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0703_kth_largest_element_in_stream;

public class KthLargestElementInStreamArray extends KthLargestElementInStream {
    private final int k;

    private int[] nums;

    public KthLargestElementInStreamArray(int k, int[] nums) {
        super(k, nums);
        this.k = k;
        for (int i: nums) {
            insert(i);
        }
    }

    private void insert(int val) {
        if (nums == null || nums.length == 0) {
            int[] addIn = new int[1];
            addIn[0] = val;
            nums = addIn;
        } else {
            int[] addIn = new int[nums.length + 1];
            for (int i = 0; i < addIn.length; i++) {
                if (i == addIn.length - 1) {
                    addIn[i] = val;
                } else if (val < nums[i]) {
                    addIn[i] = nums[i];
                } else {
                    addIn[i] = val;
                    System.arraycopy(nums, i, addIn, i + 1,
                            addIn.length - 1 - i);
                    break;
                }
            }
            nums = addIn;
        }
    }

    @Override
    public int add(int val) {
        insert(val);
        return nums[k - 1];
    }
}
