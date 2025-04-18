package leetcode.p0300_0399.p0344_reverse_string;

public class ReverseStringExchange implements ReverseString {
    @Override
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char c = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = c;
        }
    }
}
