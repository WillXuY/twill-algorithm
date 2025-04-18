/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0832_flipping_an_image;

public class FlippingAnImageLoop implements FlippingAnImage {
    @Override
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        int[][] output = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                output[i][j] = image[i][len - j - 1] ^ 1;
            }
        }
        return output;
    }
}
