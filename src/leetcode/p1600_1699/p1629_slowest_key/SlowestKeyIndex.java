package org.willxu.algorithm.service.impl.character;

import org.willxu.algorithm.service.character.SlowestKey;

import java.util.ArrayList;
import java.util.List;

public class SlowestKeyIndex implements SlowestKey {
    @Override
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        List<Integer> maxIndexList = new ArrayList<>();
        maxIndexList.add(0);
        int maxTime = releaseTimes[0];
        for (int i = 1; i < releaseTimes.length; i++) {
            int time = releaseTimes[i] - releaseTimes[i - 1];
            if (time > maxTime) {
                maxIndexList.clear();
                maxTime = time;
                maxIndexList.add(i);
            } else if (time == maxTime) {
                maxIndexList.add(i);
            }
        }
        int outputIndex = maxIndexList.get(0);
        char[] chars = keysPressed.toCharArray();
        char output = chars[outputIndex];
        for (int i = 1; i < maxIndexList.size(); i++) {
            int maxIndex = maxIndexList.get(i);
            if (chars[maxIndex] > output) {
                output = chars[maxIndex];
            }
        }
        return output;
    }
}
