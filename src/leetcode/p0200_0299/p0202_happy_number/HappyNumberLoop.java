/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0202_happy_number;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HappyNumberLoop implements HappyNumber {
    @Override
    public boolean isHappy(int n) {
        List<Integer> unhappy = Stream.of(4, 16, 37, 58, 89, 145, 42, 20)
                .collect(Collectors.toList());
        while (n != 1) {
            if (unhappy.contains(n)) {
                return false;
            }
            int next = 0;
            while (n != 0) {
                next += (n % 10) * (n % 10);
                n /= 10;
            }
            n = next;
        }
        return true;
    }
}
