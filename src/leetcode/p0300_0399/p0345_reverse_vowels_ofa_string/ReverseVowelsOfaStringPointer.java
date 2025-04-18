package leetcode.p0300_0399.p0345_reverse_vowels_ofa_string;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseVowelsOfaStringPointer implements ReverseVowelsOfaString {
    @Override
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int[] pointers = new int[s.length()];
        int size = 0;
        Set<Character> vowels = Stream.of(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ).collect(Collectors.toSet());
        for (int i = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                pointers[size] = i;
                size++;
            }
        }
        for (int i = 0; i < size / 2; i++) {
            int fromIndex = pointers[i];
            int toIndex = pointers[size - i - 1];
            char c = chars[fromIndex];
            chars[fromIndex] = chars[toIndex];
            chars[toIndex] = c;
        }
        return String.valueOf(chars);
    }
}
