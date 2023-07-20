package org.willxu.algorithm.domain.impl.set;

import org.willxu.algorithm.domain.set.InsertDeleteGetRandomO1;

import java.util.*;

public class InsertDeleteGetRandomO1Set implements InsertDeleteGetRandomO1 {
    Set<Integer> set = new HashSet<>();

    @Override
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        }
        set.add(val);
        return true;
    }

    @Override
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        }
        return false;
    }

    @Override
    public int getRandom() {
        List<Integer> list = new ArrayList<>(set);
        int random = (int) (Math.random() * list.size());
        return list.get(random);
    }
}
