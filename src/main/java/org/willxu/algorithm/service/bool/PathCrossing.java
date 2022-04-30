package org.willxu.algorithm.service.bool;

public interface PathCrossing {
    /**
     * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each
     * representing moving one unit north, south, east, or west,
     * respectively. You start at the origin (0, 0) on a 2D plane and
     * walk on the path specified by path.
     *
     * Return true if the path crosses itself at any point, that is, if
     * at any time you are on a location you have previously visited.
     * Return false otherwise.
     *
     * @param path 1 <= path.length <= 104
     *             path[i] is either 'N', 'S', 'E', or 'W'.
     */
    boolean isPathCrossing(String path);
}
