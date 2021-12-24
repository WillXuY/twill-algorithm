/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.LemonadeChange;

public class LemonadeChangeCount implements LemonadeChange {
    /**
     * Count the bills owned.
     * 1. at start: count5, count10, count20 = 0;
     * 2. meet 5: count5++;
     * 3. meet 10: need one '5' bill,
     *    count5--, count10++;
     * 4. meet 20: need one '5' + one '10' or three '5' bills,
     *    count10--, count5--, count20++;
     *    count5 -= 3, count20++;
     *    count20 is useless.
     */
    @Override
    public boolean lemonadeChange(int[] bills) {
        int count5 = 0, count10 = 0;
        for (int i: bills) {
            switch (i) {
                case 5:
                    count5++;
                    break;
                case 10:
                    if (count5 <= 0) {
                        return false;
                    } else {
                        count5--;
                        count10++;
                        break;
                    }
                case 20:
                    boolean canPayBy10 = count5 >= 1 && count10 >= 1;
                    boolean canPayBy5 = count5 >= 3;
                    if (canPayBy10) {
                        count5--;
                        count10--;
                        break;
                    } else if (canPayBy5) {
                        count5 -= 3;
                        break;
                    } else {
                        return false;
                    }
                default:
                    return false;
            }
        }
        return true;
    }
}
