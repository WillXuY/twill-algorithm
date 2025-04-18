package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.KthDistinctStringInAnArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KthDistinctStringInAnArrayList
        implements KthDistinctStringInAnArray {
    @Override
    public String kthDistinct(String[] arr, int k) {
        List<String> orderList = new ArrayList<>();
        Set<String> existSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();
        for (String a: arr) {
            if (existSet.contains(a)) {
                duplicateSet.add(a);
            } else {
                orderList.add(a);
            }
            existSet.add(a);
        }
        String output = "";
        int skip = 1;
        for (String s: orderList) {
            if (!duplicateSet.contains(s)) {
                if (skip == k) {
                    output = s;
                    break;
                } else {
                    skip++;
                }
            }
        }
        return output;
    }
}
