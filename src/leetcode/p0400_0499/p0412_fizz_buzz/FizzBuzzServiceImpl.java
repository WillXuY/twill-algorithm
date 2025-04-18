/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0400_0499.p0412_fizz_buzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzServiceImpl implements FizzBuzzService {
    /**
     * 拿不准用穷举
     * @param n the max number
     * @return list of fizz buzz
     */
    @Override
    public List<String> getFizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i < n + 1; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if (fizz && buzz) {
                result.add("FizzBuzz");
            } else if (fizz) {
                result.add("Fizz");
            } else if (buzz) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
