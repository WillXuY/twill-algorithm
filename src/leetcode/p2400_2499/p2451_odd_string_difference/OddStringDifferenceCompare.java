package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.OddStringDifference;

import java.util.Arrays;

public class OddStringDifferenceCompare implements OddStringDifference {
    @Override
    public String oddString(String[] words) {
        int len = words.length;
        int[] diffArray1 = new int[len - 1];
        String str1 = "";
        int count1 = 0;
        int[] diffArray2 = new int[len - 1];
        String str2 = "";
        int count2 = 0;
        for (String w: words) {
            int[] diff = getDifferenceOfChar(w);
            if (count1 == 0) {
                diffArray1 = diff;
                str1 = w;
                count1 = 1;
            } else if (Arrays.equals(diff, diffArray1)) {
                count1++;
                if (count2 == 1) {
                    return str2;
                }
            } else if (count2 == 0) {
                diffArray2 = diff;
                str2 = w;
                count2 = 1;
            } else if (Arrays.equals(diff, diffArray2)) {
                count2++;
                if (count1 == 1) {
                    return str1;
                }
            }
        }
        if (count1 == 1) {
            return str1;
        } else {
            return str2;
        }
    }

    private int[] getDifferenceOfChar(String word) {
        char[] chars = word.toCharArray();
        int[] output = new int[chars.length - 1];
        for (int i = 1; i < chars.length; i++) {
            output[i - 1] = chars[i] - chars[i - 1];
        }
        return output;
    }
}
