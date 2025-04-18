package leetcode.p1400_1499.p1486_xor_operation_in_an_array;

public class XorOperationInAnArrayLoop implements XorOperationInAnArray {
    @Override
    public int xorOperation(int n, int start) {
        int output = start;
        for (int i = 1; i < n; i++) {
            start += 2;
            output = output ^ start;
        }
        return output;
    }
}
