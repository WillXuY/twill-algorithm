package leetcode.p0300_0399.p0380_insert_delete_get_random_o1;

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
