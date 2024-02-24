package org.willxu.algorithm.service.bool;

import java.util.List;

public interface KeysAndRooms {
    /**
     * There are n rooms labeled from 0 to n - 1 and all the rooms are
     * locked except for room 0. Your goal is to visit all the rooms.
     * However, you cannot enter a locked room without having its key.
     * <p>
     * When you visit a room, you may find a set of distinct keys in it.
     * Each key has a number on it, denoting which room it unlocks, and
     * you can take all of them with you to unlock the other rooms.
     * <p>
     * Given an array rooms where rooms[i] is the set of keys that you
     * can obtain if you visited room i, return true if you can visit
     * all the rooms, or false otherwise.
     *
     * @param rooms n == rooms.length
     *              2 <= n <= 1000
     *              0 <= rooms[i].length <= 1000
     *              1 <= sum(rooms[i].length) <= 3000
     *              0 <= rooms[i][j] < n
     *              All the values of rooms[i] are unique.
     */
    boolean canVisitAllRooms(List<List<Integer>> rooms);
}
