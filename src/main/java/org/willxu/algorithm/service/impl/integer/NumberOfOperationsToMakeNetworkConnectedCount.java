package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.NumberOfOperationsToMakeNetworkConnected;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfOperationsToMakeNetworkConnectedCount
        implements NumberOfOperationsToMakeNetworkConnected {
    @Override
    public int makeConnected(int n, int[][] connections) {
        if (n - 1 > connections.length) {
            return -1;
        }
        Set<Integer> allNum = new HashSet<>();
        List<Set<Integer>> connectionList = new ArrayList<>();
        int connectedCount = 0;
        for (int[] c: connections) {
            if (allNum.contains(c[0]) || allNum.contains(c[1])) {
                int index0 = -1, index1 = -1;
                for (int i = 0; i < connectionList.size(); i++) {
                    Set<Integer> old = connectionList.get(i);
                    if (old.contains(c[0])) {
                        index0 = i;
                    } else if (old.contains(c[1])) {
                        index1 = i;
                    }
                }
                if (index0 == -1) {
                    if (index1 != -1) {
                        Set<Integer> exit1 = connectionList.get(index1);
                        if (exit1.contains(c[0])) {
                            connectedCount++;
                        } else {
                            exit1.add(c[0]);
                        }
                    }
                } else {
                    if (index1 == -1) {
                        Set<Integer> exit0 = connectionList.get(index0);
                        if (exit0.contains(c[1])) {
                            connectedCount++;
                        } else {
                            exit0.add(c[1]);
                        }
                    } else {
                        Set<Integer> exit0 = connectionList.get(index0);
                        Set<Integer> exit1 = connectionList.get(index1);
                        exit0.addAll(exit1);
                        connectionList.remove(index1);
                    }
                }
            } else {
                Set<Integer> set = new HashSet<>();
                set.add(c[0]);
                set.add(c[1]);
                connectionList.add(set);
            }
            allNum.add(c[0]);
            allNum.add(c[1]);
        }
        return n - 1 - connections.length + connectedCount;
    }
}
