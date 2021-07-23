package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.HappyNumber;

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
