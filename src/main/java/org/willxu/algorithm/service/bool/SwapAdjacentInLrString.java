package org.willxu.algorithm.service.bool;

public interface SwapAdjacentInLrString {
    /**
     * In a string composed of 'L', 'R', and 'X' characters, like
     * "RXXLRXRXL", a move consists of either replacing one occurrence
     * of "XL" with "LX", or replacing one occurrence of "RX" with "XR".
     * Given the starting string start and the ending string end, return
     * True if and only if there exists a sequence of moves to transform
     * one string to the other.
     *
     * @param start 1 <= start.length <= 10^4
     * @param end start.length == end.length
     *            Both start and end will only consist of characters in
     *            'L', 'R', and 'X'.
     */
    boolean canTransform(String start, String end);
}
