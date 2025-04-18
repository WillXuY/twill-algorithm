package leetcode.p2000_2099.p2000_reverse_prefix_of_word;

public class ReversePrefixOfWordLoop implements ReversePrefixOfWord {
    @Override
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();
        int index = 0;
        while (index < chars.length) {
            if (chars[index] == ch) {
                break;
            }
            index++;
        }
        if (index == chars.length) {
            return word;
        }
        index++;
        StringBuilder output = new StringBuilder(word.substring(0, index));
        output.reverse().append(word.substring(index));
        return output.toString();
    }
}
