package org.willxu.algorithm.service.impl.strs;

import org.willxu.algorithm.service.strs.ReorderDataInLogFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class ReorderDataInLogFilesSplit implements ReorderDataInLogFiles {
    /**
     * 1. Split logs.
     * 2. Check second word of log.
     * 3. Add letters in TreeMap, add digit in list.
     * 4. Set treeMap and list in String[].
     *
     * @param logs 1 <= logs.length <= 100
     *             3 <= logs[i].length <= 100
     *             All the tokens of logs[i] are separated by single
     *             space.
     *             Logs[i] is guaranteed to have an identifier.
     * @return letterMap + digitList
     */
    @Override
    public String[] reorderLogFiles(String[] logs) {
        TreeMap<String, String> letterMap = new TreeMap<>();
        List<String> digitList = new ArrayList<>();
        for (String l: logs) {
            int spaceIndex = l.indexOf(' ');
            if (Character.isDigit(l.charAt(spaceIndex + 1))) {
                digitList.add(l);
            } else {
                letterMap.put(l.substring(spaceIndex + 1) + " !"
                        + l.subSequence(0, spaceIndex), l);
            }
        }
        int letterSize = letterMap.size();
        int digitSize = digitList.size();
        String[] output = new String[letterSize + digitSize];
        int index = 0;
        for (String s: letterMap.values()) {
            output[index] = s;
            index++;
        }
        for (int i = 0; i < digitSize; i++) {
            output[index + i] = digitList.get(i);
        }
        return output;
    }
}
