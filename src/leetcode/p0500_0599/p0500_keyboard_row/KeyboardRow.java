package leetcode.p0500_0599.p0500_keyboard_row;

public interface KeyboardRow {
    /**
     * Given an array of strings words, return the words that can be
     * typed using letters of the alphabet on only one row of American
     * keyboard like the image below.
     * In the American keyboard:
     * - the first row consists of the characters "qwertyuiop",
     * - the second row consists of the characters "asdfghjkl", and
     * - the third row consists of the characters "zxcvbnm".
     *
     * @param words 1 <= words.length <= 20
     *              1 <= words[i].length <= 100
     *              consists of English letters
     *              (both lowercase and uppercase).
     * @return the array of keyboard row words.
     */
    String[] findWords(String[] words);
}
