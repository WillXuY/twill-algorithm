package org.willxu.algorithm.service.int2strs;

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
