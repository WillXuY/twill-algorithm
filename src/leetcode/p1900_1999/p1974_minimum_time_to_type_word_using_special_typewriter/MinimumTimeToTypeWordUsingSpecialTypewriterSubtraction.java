package leetcode.p1900_1999.p1974_minimum_time_to_type_word_using_special_typewriter;

public class MinimumTimeToTypeWordUsingSpecialTypewriterSubtraction
        implements MinimumTimeToTypeWordUsingSpecialTypewriter {
    @Override
    public int minTimeToType(String word) {
        char last = 'a';
        int output = 0;
        for (char c: word.toCharArray()) {
            int difference = Math.abs(c - last);
            output += Math.min(difference, 26 - difference);
            last = c;
        }
        return output + word.length();
    }
}
