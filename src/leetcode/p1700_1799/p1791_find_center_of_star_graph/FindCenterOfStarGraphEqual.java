package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FindCenterOfStarGraph;

public class FindCenterOfStarGraphEqual implements FindCenterOfStarGraph {
    @Override
    public int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ?
            edges[0][0] : edges[0][1];
    }
}
