package leetcode.p1600_1699.p1652_defuse_the_bomb;

public class DefuseTheBombLoop implements DefuseTheBomb {
    @Override
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];
        }
        if (k > 0) {
            return nextLoopDecrypt(code, k);
        } else {
            return previousLoopDecrypt(code, -k);
        }
    }

    private int[] nextLoopDecrypt(int[] code, int k) {
        int length = code.length;
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 1; j <= k; j++) {
                int index = (i + j) % length;
                count += code[index];
            }
            output[i] = count;
        }
        return output;
    }

    private int[] previousLoopDecrypt(int[] code, int k) {
        int length = code.length;
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 1; j <= k; j++) {
                int index = (i - j) % length;
                if (index < 0) {
                    index += length;
                }
                count += code[index];
            }
            output[i] = count;
        }
        return output;
    }
}
