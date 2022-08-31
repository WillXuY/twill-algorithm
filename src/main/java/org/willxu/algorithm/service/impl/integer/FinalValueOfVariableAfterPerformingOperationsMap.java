package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.FinalValueOfVariableAfterPerformingOperations;

import java.util.HashMap;
import java.util.Map;

public class FinalValueOfVariableAfterPerformingOperationsMap
        implements FinalValueOfVariableAfterPerformingOperations {
    @Override
    public int finalValueAfterOperations(String[] operations) {
        Map<String, Integer> map = new HashMap<>(4);
        map.put("++X", 1);
        map.put("X++", 1);
        map.put("--X", -1);
        map.put("X--", -1);
        int output = 0;
        for (String o: operations) {
            output += map.get(o);
        }
        return output;
    }
}
