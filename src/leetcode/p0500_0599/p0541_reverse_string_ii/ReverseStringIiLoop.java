package leetcode.p0500_0599.p0541_reverse_string_ii;

public class ReverseStringIiLoop implements ReverseStringIi {
    @Override
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = k - 1;
        while (start < chars.length) {
            if (end >= chars.length) {
                end = chars.length - 1;
            }
            for (int i = 0; i < (end - start + 1) / 2; i++) {
                char c = chars[start + i];
                chars[start + i] = chars[end - i];
                chars[end - i] = c;
            }
            start += 2 * k;
            end += 2 * k;
        }
        return new String(chars);
    }
}
