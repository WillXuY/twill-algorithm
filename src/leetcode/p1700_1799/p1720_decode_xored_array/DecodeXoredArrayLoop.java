package leetcode.p1700_1799.p1720_decode_xored_array;

public class DecodeXoredArrayLoop implements DecodeXoredArray {
    @Override
    public int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];
        output[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            output[i + 1] = output[i] ^ encoded[i];
        }
        return output;
    }
}
