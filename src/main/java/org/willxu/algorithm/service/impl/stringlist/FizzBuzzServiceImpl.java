package org.willxu.algorithm.service.impl.stringlist;

import org.willxu.algorithm.service.stringlist.FizzBuzzService;

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
