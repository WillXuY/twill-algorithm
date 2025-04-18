/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MajorityElement;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class MajorityElementMap implements MajorityElement {
    @Override
    public int majorityElement(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int n: nums) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        Optional<Map.Entry<Integer, Integer>> optional = map.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        if (optional.isPresent()) {
            return optional.get().getKey();
        }
        return 0;
    }
}
