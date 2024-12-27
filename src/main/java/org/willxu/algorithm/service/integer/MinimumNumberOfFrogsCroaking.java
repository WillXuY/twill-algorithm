package org.willxu.algorithm.service.integer;

public interface MinimumNumberOfFrogsCroaking {
    /**
     * You are given the string croakOfFrogs, which represents a
     * combination of the string "croak" from different frogs, that is,
     * multiple frogs can croak at the same time, so multiple "croak"
     * are mixed.
     * <p>
     * Return the minimum number of different frogs to finish all the
     * croaks in the given string.
     * <p>
     * A valid "croak" means a frog is printing five letters 'c', 'r',
     * 'o', 'a', and 'k' sequentially. The frogs have to print all five
     * letters to finish a croak. If the given string is not a
     * combination of a valid "croak" return -1.
     *
     * @param croakOfFrogs 1 <= croakOfFrogs.length <= 105
     *                     croakOfFrogs is either 'c', 'r', 'o', 'a', or 'k'.
     */
    int minNumberOfFrogs(String croakOfFrogs);
}
