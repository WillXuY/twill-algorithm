package leetcode.p0400_0499.p0401_binary_watch;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class BinaryWatchCombinations implements BinaryWatch {
    /**
     *   H 8 4 2 1 PM
     *     shows 0-11
     *   M 32 16 8 4 2 1
     *     shows 0-59
     *
     * H: could light 0-3
     * M: could light 0-5
     *
     * @param turnedOn 0 <= turnedOn <= 10
     * @return arrange from small to large.
     */
    @Override
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> readWatchList = new ArrayList<>();
        int[] hours = new int[] {1, 2, 4, 8};
        int[] minutes = new int[] {1, 2, 4, 8, 16, 32};
        for (int h = 0; h <= 3 && h <= turnedOn; h++) {
            int m = turnedOn - h;
            if (m < 0 || m > 5) {
                continue;
            }
            TreeSet<Integer> hourSet = getPossibleBinaryList(h, 0, 0, hours, 11);
            for (Integer hour: hourSet) {
                String hourString = hour + ":";
                TreeSet<Integer> minuteSet = getPossibleBinaryList(m, 0, 0, minutes, 59);
                for (Integer minute: minuteSet) {
                    if (minute < 10) {
                        readWatchList.add(hourString + "0" + minute);
                    } else {
                        readWatchList.add(hourString + minute);
                    }
                }
            }
        }
        return readWatchList;
    }

    /**
     * Find all the possible binary number.
     *
     * @param num light number
     * @param start start index to pick
     * @param add added number that showed by the light
     * @param binaries array of numbers showed by the light
     * @param max include
     * @return all the possible numbers showed by the light.
     */
    public TreeSet<Integer> getPossibleBinaryList(int num, int start, int add, int[] binaries, int max) {
        TreeSet<Integer> possibleList = new TreeSet<>();
        if (num == 0) {
            possibleList.add(0);
        } else if (num == 1) {
            for (int i = start; i < binaries.length; i++) {
                int sum = add + binaries[i];
                if (sum <= max) {
                    possibleList.add(sum);
                }
            }
        } else if (num > 1) {
            for (int i = start; i <= binaries.length - num; i++) {
                possibleList.addAll(getPossibleBinaryList(
                        num - 1, i + 1, add + binaries[i], binaries, max));
            }
        }
        return possibleList;
    }
}
