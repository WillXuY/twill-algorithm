package leetcode.p0900_0999.p0917_reverse_only_letters;

public class ReverseOnlyLettersIndex implements ReverseOnlyLetters {
    @Override
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
                continue;
            } else if (!Character.isLetter(chars[end])) {
                end--;
                continue;
            }
            char change = chars[start];
            chars[start] = chars[end];
            chars[end] = change;
            start++;
            end--;
        }
        return new String(chars);
    }
}
