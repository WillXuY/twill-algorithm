package org.willxu.algorithm.service.integer;

public interface GroupsOfSpecialEquivalentStrings {
    /**
     * You are given an array of strings of the same length words.
     * <p>
     * In one move, you can swap any two even indexed characters or any
     * two odd indexed characters of a string words[i].
     * <p>
     * Two strings words[i] and words[j] are special-equivalent if after
     * any number of moves, words[i] == words[j].
     * <p>
     * - For example, words[i] = "zzxy" and words[j] = "xyzz" are
     *   special-equivalent because we may make the moves
     *   "zzxy" -> "xzzy" -> "xyzz".
     * <p>
     * A group of special-equivalent strings from words is a non-empty
     * subset of words such that:
     * <p>
     * - Every pair of strings in the group are special equivalent, and
     * - The group is the largest size possible (i.e., there is not a string words[i] not in the group such that words[i] is special-equivalent to every string in the group).
     * <p>
     * Return the number of groups of special-equivalent strings from
     * words.
     *
     * @param words 1 <= words.length <= 1000
     *              1 <= words[i].length <= 20
     *              words[i] consist of lowercase English letters.
     *              All the strings are of the same length.
     */
    int numSpecialEquivGroups(String[] words);
}
