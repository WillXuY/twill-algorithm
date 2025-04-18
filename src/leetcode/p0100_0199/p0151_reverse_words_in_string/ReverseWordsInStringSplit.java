package leetcode.p0100_0199.p0151_reverse_words_in_string;

public class ReverseWordsInStringSplit implements ReverseWordsInString {
    @Override
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
