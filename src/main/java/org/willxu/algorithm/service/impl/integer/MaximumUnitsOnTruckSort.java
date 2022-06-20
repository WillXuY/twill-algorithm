package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumUnitsOnTruck;

import java.util.Comparator;
import java.util.TreeMap;

public class MaximumUnitsOnTruckSort implements MaximumUnitsOnTruck {
    @Override
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        TreeMap<Integer, Integer> sortAndCount = new TreeMap<>(
                Comparator.reverseOrder());
        for (int[] box: boxTypes) {
            if (sortAndCount.containsKey(box[1])) {
                sortAndCount.put(box[1], sortAndCount.get(box[1]) + box[0]);
            } else {
                sortAndCount.put(box[1], box[0]);
            }
        }
        int output = 0;
        for (int k: sortAndCount.keySet()) {
            int amount = sortAndCount.get(k);
            if (amount < truckSize) {
                output += amount * k;
                truckSize -= amount;
            } else {
                output += truckSize * k;
                break;
            }
        }
        return output;
    }
}
