package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.SortIntegersByTheNumberOf1Bits;

public class SortIntegersByTheNumberOf1BitsCount
        implements SortIntegersByTheNumberOf1Bits {
    @Override
    public int[] sortByBits(int[] arr) {
        int[] sorted = new int[arr.length];
        int[] counts = new int[arr.length];
        sorted[0] = arr[0];
        counts[0] = count1Bits(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int c = count1Bits(arr[i]);
            for (int j = 0; j < i; j++) {
                if (c < counts[j]) {
                    System.arraycopy(sorted, j, sorted, j + 1, i - j);
                    sorted[j] = arr[i];
                    System.arraycopy(counts, j, counts, j + 1, i - j);
                    counts[j] = c;
                    break;
                } else if (c == counts[j]) {
                    if (arr[i] <= sorted[j]) {
                        System.arraycopy(sorted, j, sorted, j + 1, i - j);
                        sorted[j] = arr[i];
                        System.arraycopy(counts, j, counts, j + 1, i - j);
                        counts[j] = c;
                        break;
                    } else if (j == i - 1) {
                        sorted[i] = arr[i];
                        counts[i] = c;
                        break;
                    } else if (c != counts[j + 1]){
                        System.arraycopy(sorted, j + 1, sorted,
                                j + 2, i - 1 - j);
                        sorted[j + 1] = arr[i];
                        System.arraycopy(counts, j + 1, counts,
                                j + 2, i - 1 - j);
                        counts[j + 1] = c;
                        break;
                    }
                } else if (j == i - 1) {
                    sorted[i] = arr[i];
                    counts[i] = c;
                    break;
                }
            }
        }
        return sorted;
    }

    private int count1Bits(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                count++;
            }
            num /= 2;
        }
        return count;
    }
}
