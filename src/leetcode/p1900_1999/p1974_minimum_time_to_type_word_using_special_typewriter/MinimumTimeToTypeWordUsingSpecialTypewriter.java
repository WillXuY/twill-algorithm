package leetcode.p1900_1999.p1974_minimum_time_to_type_word_using_special_typewriter;

public interface MinimumTimeToTypeWordUsingSpecialTypewriter {
    /**
     * There is a special typewriter with lowercase English letters 'a'
     * to 'z' arranged in a circle with a pointer. A character can only
     * be typed if the pointer is pointing to that character. The
     * pointer is initially pointing to the character 'a'.
     * <p>
     * Each second, you may perform one of the following operations:
     * - Move the pointer one character counterclockwise or clockwise.
     * - Type the character the pointer is currently on.
     * <p>
     * Given a string word, return the minimum number of seconds to type
     * out the characters in word.
     *
     * @param word 1 <= word.length <= 100
     *             word consists of lowercase English letters.
     */
    int minTimeToType(String word);
}
