package org.willxu.algorithm.service.impl.intlist;

import org.willxu.algorithm.service.intlist.GrayCode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GrayCodeRecursive implements GrayCode {
    @Override
    public List<Integer> grayCode(int n) {
        if (n == 1) {
            return Stream.of(0, 1).collect(Collectors.toList());
        }
        List<Integer> sub = grayCode(n - 1);
        List<Integer> result = new ArrayList<>(sub);
        int add = 1 << (n - 1);
        for (int i = sub.size() - 1; i >= 0; i--) {
            result.add(add + sub.get(i));
        }
        return result;
    }
}
