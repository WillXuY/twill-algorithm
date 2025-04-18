/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0228_summary_ranges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRangesCycle implements SummaryRanges {
    @Override
    public List<String> summaryRanges(int[] nums) {
        List<String> summaryResult = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        if (nums.length <= 0) {
            return Collections.emptyList();
        }
        int last = nums[0];
        stringBuilder.append(last);
        if (nums.length == 1) {
            summaryResult.add(stringBuilder.toString());
            return summaryResult;
        }
        boolean ranges = false;
        for (int i = 1; i < nums.length; i++) {
            if (++last == nums[i]) {
                ranges = true;
            } else {
                if (ranges) {
                    stringBuilder.append("->").append(nums[i - 1]);
                }
                last = nums[i];
                summaryResult.add(stringBuilder.toString());
                stringBuilder = new StringBuilder(String.valueOf(last));
                ranges = false;
            }
        }
        if (ranges) {
            stringBuilder.append("->");
        } else {
            stringBuilder = new StringBuilder();
        }
        stringBuilder.append(nums[nums.length - 1]);
        summaryResult.add(stringBuilder.toString());
        return summaryResult;
    }
}
