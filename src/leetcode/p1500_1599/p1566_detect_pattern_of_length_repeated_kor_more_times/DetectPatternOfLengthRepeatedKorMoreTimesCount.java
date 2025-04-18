package leetcode.p1500_1599.p1566_detect_pattern_of_length_repeated_kor_more_times;

import java.util.ArrayList;
import java.util.List;

public class DetectPatternOfLengthRepeatedKorMoreTimesCount
        implements DetectPatternOfLengthRepeatedKorMoreTimes {
    @Override
    public boolean containsPattern(int[] arr, int m, int k) {
        List<String> patternList = new ArrayList<>();
        int[] counts = new int[m];
        for (int i = 0; i <= arr.length - m; i++) {
            StringBuilder pattern = new StringBuilder();
            for (int j = 0; j < m; j++) {
                pattern.append(arr[i + j]).append(',');
            }
            String str = pattern.toString();
            if (i < m) {
                patternList.add(str);
                counts[i] = 1;
                continue;
            }
            int saveIndex = i % m;
            if (str.equals(patternList.get(saveIndex))) {
                counts[saveIndex]++;
                if (counts[saveIndex] >= k) {
                    return true;
                }
            } else {
                patternList.set(saveIndex, str);
                counts[saveIndex] = 1;
            }
        }
        return false;
    }
}
