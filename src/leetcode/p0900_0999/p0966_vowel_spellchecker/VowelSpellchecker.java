package leetcode.p0900_0999.p0966_vowel_spellchecker;

public interface VowelSpellchecker {
    /**
     * Given a wordlist, we want to implement a spellchecker that
     * converts a query word into a correct word.
     * <p>
     * For a given query word, the spell checker handles two categories
     * of spelling mistakes:
     * <p>
     * - Capitalization: If the query matches a word in the wordlist
     *   (case-insensitive), then the query word is returned with the
     *   same case as the case in the wordlist.
     *   - Example: wordlist = ["yellow"], query = "YellOw":
     *     correct = "yellow"
     *   - Example: wordlist = ["Yellow"], query = "yellow":
     *     correct = "Yellow"
     *   - Example: wordlist = ["yellow"], query = "yellow":
     *     correct = "yellow"
     * <p>
     * - Vowel Errors: If after replacing the vowels
     *   ('a', 'e', 'i', 'o', 'u') of the query word with any vowel
     *   individually, it matches a word in the wordlist
     *   (case-insensitive), then the query word is returned with the
     *   same case as the match in the wordlist.
     *   - Example: wordlist = ["YellOw"], query = "yollow":
     *     correct = "YellOw"
     *   - Example: wordlist = ["YellOw"], query = "yeellow":
     *     correct = "" (no match)
     *   - Example: wordlist = ["YellOw"], query = "yllw":
     *     correct = "" (no match)
     * <p>
     * In addition, the spell checker operates under the following
     * precedence rules:
     * <p>
     * - When the query exactly matches a word in the wordlist
     *   (case-sensitive), you should return the same word back.
     * - When the query matches a word up to capitlization, you should
     *   return the first such match in the wordlist.
     * - When the query matches a word up to vowel errors, you should
     *   return the first such match in the wordlist.
     * - If the query has no matches in the wordlist, you should return
     *   the empty string.
     * <p>
     * Given some queries, return a list of words answer, where
     * answer[i] is the correct word for query = queries[i].
     *
     * @param wordlist 1 <= wordlist.length <= 5000
     *                 1 <= wordlist[i].length <= 7
     *                 consist only of only English letters.
     * @param queries 1 <= queries.length <= 5000
     *                1 <= queries[i].length <= 7
     *                consist only of only English letters.
     */
    String[] spellchecker(String[] wordlist, String[] queries);
}
