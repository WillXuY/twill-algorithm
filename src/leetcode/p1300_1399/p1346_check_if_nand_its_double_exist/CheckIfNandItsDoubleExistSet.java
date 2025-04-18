package leetcode.p1300_1399.p1346_check_if_nand_its_double_exist;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExistSet implements CheckIfNandItsDoubleExist {
    @Override
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        boolean containsZero = false;
        for (int i: arr) {
            if (i == 0) {
                if (containsZero) {
                    return true;
                } else {
                    containsZero = true;
                }
            }
            set.add(i);
        }
        for (int i: set) {
            if (i != 0 && set.contains(2 * i)) {
                return true;
            }
        }
        return false;
    }
}
