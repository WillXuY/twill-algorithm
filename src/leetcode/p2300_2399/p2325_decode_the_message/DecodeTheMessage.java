package leetcode.p2300_2399.p2325_decode_the_message;

public interface DecodeTheMessage {
    /**
     * You are given the strings key and message, which represent a
     * cipher key and a secret message, respectively. The steps to
     * decode message are as follows:
     * <p>
     * 1. Use the first appearance of all 26 lowercase English letters
     *    in key as the order of the substitution table.
     * 2. Align the substitution table with the regular English alphabet
     * 3. Each letter in message is then substituted using the table.
     * 4. Spaces ' ' are transformed to themselves.
     * <p>
     * - For example, given key = "happy boy" (actual key would have at
     *   least one instance of each letter in the alphabet), we have the
     *   partial substitution table of ('h' -> 'a', 'a' -> 'b',
     *   'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
     * <p>
     * Return the decoded message.
     *
     * @param key 26 <= key.length <= 2000
     *            consists of lowercase English letters and ' '.
     *            contains every letter in the English alphabet
     *            ('a' to 'z') at least once.
     * @param message 1 <= message.length <= 2000
     *                consists of lowercase English letters and ' '.
     */
    String decodeMessage(String key, String message);
}
