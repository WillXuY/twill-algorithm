package leetcode.p0000_0099.p0057_insert_interval;

import java.util.ArrayList;
import java.util.List;

public class InsertIntervalLoop implements InsertInterval {
    @Override
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        boolean inserted = false, inserting = false;
        int start = 0;
        for (int[] i: intervals) {
            if (inserted) {
                result.add(i);
            } else if (inserting) {
                if (newInterval[1] < i[0]) {
                    result.add(new int[] {start, newInterval[1]});
                    result.add(i);
                    inserted = true;
                    inserting = false;
                } else if (newInterval[1] <= i[1]) {
                    result.add(new int[] {start, i[1]});
                    inserted = true;
                    inserting = false;
                }
            } else if (newInterval[0] > i[1]) {
                result.add(i);
            } else if (newInterval[1] < i[0]){
                result.add(newInterval);
                result.add(i);
                inserted = true;
            } else if (newInterval[1] <= i[1]) {
                start = Math.min(i[0], newInterval[0]);
                result.add(new int[] {start, i[1]});
                inserted = true;
            } else {
                start = Math.min(i[0], newInterval[0]);
                inserting = true;
            }
        }
        if (inserting) {
            result.add(new int[] {start, newInterval[1]});
        } else if (!inserted) {
            result.add(newInterval);
        }
        return result.toArray(new int[0][]);
    }
}
