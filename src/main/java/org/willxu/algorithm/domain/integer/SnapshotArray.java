package org.willxu.algorithm.domain.integer;

/**
 * Implement a SnapshotArray that supports the following interface:
 * <p>
 * SnapshotArray(int length) initializes an array-like data structure
 * with the given length. Initially, each element equals 0.
 *<p>
 * At most 5 * 10^4 calls will be made to set, snap, and get.
 */
public interface SnapshotArray {
    /**
     * sets the element at the given index to be equal to val.
     *
     * @param index 1 <= length <= 5 * 10^4
     *              0 <= index < length
     * @param val 0 <= val <= 10^9
     */
    void set(int index, int val);

    /**
     * takes a snapshot of the array and returns the snap_id: the total
     * number of times we called snap() minus 1.
     */
    int snap();

    /**
     * @param index 1 <= length <= 5 * 10^4
     *              0 <= index < length
     * @param snap_id 0 <= snap_id < (the total number of times we call
     *                snap())
     * @return the value at the given index, at the time we took the
     *         snapshot with the given snap_id
     */
    int get(int index, int snap_id);
}
