/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0860_lemonade_change;

public interface LemonadeChange {
    /**
     * At a lemonade stand, each lemonade costs $5. Customers are
     * standing in a queue to buy from you, and order one at a time (in
     * the order specified by bills). Each customer will only buy one
     * lemonade and pay with either a $5, $10, or $20 bill. You must
     * provide the correct change to each customer so that the net
     * transaction is that the customer pays $5.
     * Note that you don't have any change in hand at first.
     * Given an integer array bills where bills[i] is the bill the i^th
     * customer pays, return true if you can provide every customer
     * with correct change, or false otherwise.
     *
     * @param bills 1 <= bills.length <= 10^5
     *              bills[i] is either 5, 10, or 20.
     * @return can provide the correct change.
     */
    boolean lemonadeChange(int[] bills);
}
