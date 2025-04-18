package leetcode.p0900_0999.p0989_add_to_array_form_of_integer;

import java.util.LinkedList;
import java.util.List;

public class AddToArrayFormOfIntegerDivide implements AddToArrayFormOfInteger {
    @Override
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> output = new LinkedList<>();
        int add = 0, index = num.length - 1;
        while (k != 0 || add != 0 || index >= 0) {
            int n = 0;
            if (index >= 0) {
                n = num[index];
            }
            int remainder = k % 10;
            int sum = remainder + n + add;
            add = sum / 10;
            output.add(0, sum % 10);
            k = k / 10;
            index--;
        }
        return output;
    }
}
