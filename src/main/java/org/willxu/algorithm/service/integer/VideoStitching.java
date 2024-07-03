package org.willxu.algorithm.service.integer;

public interface VideoStitching {
    /**
     * You are given a series of video clips from a sporting event that
     * lasted time seconds. These video clips can be overlapping with
     * each other and have varying lengths.
     * <p>
     * Each video clip is described by an array clips where
     * clips[i] = [start_i, end_i] indicates that the ith clip started
     * at start_i and ended at end_i.
     * <p>
     * We can cut these clips into segments freely.
     * <p>
     * - For example, a clip [0, 7] can be cut into segments
     *   [0, 1] + [1, 3] + [3, 7].
     * <p>
     * Return the minimum number of clips needed so that we can cut the
     * clips into segments that cover the entire sporting event
     * [0, time]. If the task is impossible, return -1.
     *
     * @param clips 1 <= clips.length <= 100
     *              0 <= start_i <= end_i <= 100
     * @param time 1 <= time <= 100
     */
    int videoStitching(int[][] clips, int time);
}
