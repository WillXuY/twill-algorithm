package leetcode.p0900_0999.p0953_verifying_an_alien_dictionary;

public interface VerifyingAnAlienDictionary {
    /**
     * In an alien language, surprisingly, they also use English
     * lowercase letters, but possibly in a different order. The order
     * of the alphabet is some permutation of lowercase letters.
     * Given a sequence of words written in the alien language, and the
     * order of the alphabet, return true if and only if the given words
     * are sorted lexicographically in this alien language.
     *
     * @param words 1 <= words.length <= 100
     *              1 <= words[i].length <= 20
     * @param order order.length = 26
     *              All characters in words[i] and order are English
     *              lowercase letters.
     * @return is the words sorted by order.
     */
    boolean isAlienSorted(String[] words, String order);
}
