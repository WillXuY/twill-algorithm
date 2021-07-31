/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.stringlist;

import java.util.List;

public interface FizzBuzzService {
    /**
     * https://leetcode.com/problems/fizz-buzz/
     * 412. Fizz Buzz
     *
     * Write a program that outputs the string representation of numbers from 1 to n.
     * But for multiples of three it should output "Fizz" instead of the number and for
     * the multiples of five output "Buzz". For numbers which are multiples of both three
     * and five output "FizzBuzz".
     */
    List<String> getFizzBuzz(int n);
}
