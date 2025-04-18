/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0599_minimum_index_sum_of_two_lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoListsMap implements MinimumIndexSumOfTwoLists {
    @Override
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.containsKey(s)) {
                int sum = map.get(s) + i;
                if (list.size() == 0) {
                    list.add(s);
                    map.put(s, sum);
                } else if (sum < map.get(list.get(0))) {
                    list.clear();
                    list.add(s);
                    map.put(s, sum);
                } else if (sum == map.get(list.get(0))) {
                    list.add(s);
                }
            }
        }
        String[] output = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            output[i] = list.get(i);
        }
        return output;
    }
}
