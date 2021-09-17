package org.willxu.algorithm.service.impl.stringlist;

import org.willxu.algorithm.service.stringlist.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzCycle implements FizzBuzz {
    @Override
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if (fizz && buzz) {
                list.add("FizzBuzz");
            } else if (fizz) {
                list.add("Fizz");
            } else if (buzz) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
