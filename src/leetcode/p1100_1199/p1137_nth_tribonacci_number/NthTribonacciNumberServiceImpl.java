/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p1100_1199.p1137_nth_tribonacci_number;

public class NthTribonacciNumberServiceImpl implements NthTribonacciNumberService {
    /**
     * 采取正面顺序计算，记录四个数据
     * @param n the input number n
     * @return the N-th Tribonacci Number
     */
    @Override
    public int getNthTribonacciNumber(int n) {
        // 排除特殊条件
        if (n == 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int t0 = 0, t1 = 1, t2 = 1, tn = 2;
        for (int i = 3; i <= n; i++){
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return tn;
    }
}
