package org.willxu.algorithm.service.impl.integerlist;

import org.willxu.algorithm.service.integerlist.PascalsTriangleIi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PascalsTriangleIiRecursive implements PascalsTriangleIi {
    @Override
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return Collections.singletonList(1);
        } else if (rowIndex == 1) {
            return Stream.of(1, 1).collect(Collectors.toList());
        }
        List<Integer> r = new ArrayList<>();
        r.add(1);
        List<Integer> last = getRow(rowIndex - 1);
        for (int i = 1; i < last.size(); i++) {
            r.add(last.get(i - 1) + last.get(i));
        }
        r.add(1);
        return r;
    }
}
