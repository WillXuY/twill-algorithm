package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.FindIfPathExistsInGraph;

import java.util.*;

public class FindIfPathExistsInGraphLoop implements FindIfPathExistsInGraph {
    @Override
    public boolean validPath(int n, int[][] edges,
                             int source, int destination) {
        Set<Integer> arriveSource = new HashSet<>();
        arriveSource.add(source);
        Set<Integer> arriveDestination = new HashSet<>();
        arriveDestination.add(destination);
        if (edges.length == 0 || edges[0].length == 0) {
            return source == destination;
        }
        while (true) {
            Set<Integer> nextSource = new HashSet<>(arriveSource);
            Set<Integer> nextDestination = new HashSet<>(arriveDestination);
            for (int[] e: edges) {
                if (arriveSource.contains(e[0])) {
                    if (arriveDestination.contains(e[0])) {
                        return true;
                    }
                    nextSource.add(e[1]);
                }
                if (arriveDestination.contains(e[0])) {
                    nextDestination.add(e[1]);
                }
                if (arriveSource.contains(e[1])) {
                    if (arriveDestination.contains(e[1])) {
                        return true;
                    }
                    nextSource.add(e[0]);
                }
                if (arriveDestination.contains(e[1])) {
                    nextDestination.add(e[0]);
                }
            }
            if (nextSource.size() == arriveSource.size()
                    && nextDestination.size() == arriveDestination.size()) {
                break;
            } else {
                arriveSource = new HashSet<>(nextSource);
                arriveDestination = new HashSet<>(nextDestination);
            }
        }
        return false;
    }
}
