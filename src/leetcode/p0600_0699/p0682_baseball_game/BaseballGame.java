/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

public interface BaseballGame {
    /**
     * You are keeping score for a baseball game with strange rules. The
     * game consists of several rounds, where the scores of past rounds
     * may affect future rounds' scores.
     * At the beginning of the game, you start with an empty record. You
     * are given a list of strings ops, where ops[i] is the i^th
     * operation you must apply to the record and is one of the
     * following:
     * 1. An integer x - Record a new score of x.
     * 2. "+" - Record a new score that is the sum of the previous two
     *    scores. It is guaranteed there will always be two previous
     *    scores.
     * 3. "D" - Record a new score that is double the previous score. It
     *    is guaranteed there will always be a previous score.
     * 4. "C" - Invalidate the previous score, removing it from the
     *    record. It is guaranteed there will always be a previous
     *    score.
     * Return the sum of all the scores on the record.
     *
     * @param ops 1 <= ops.length <= 1000
     *            ops[i] is "C", "D", "+", or a string representing an
     *            integer in the range [-3 * 10^4, 3 * 10^4].
     *            For operation "+", there will always be at least two
     *            previous scores on the record.
     *            For operations "C" and "D", there will always be at
     *            least one previous score on the record.
     * @return the sum of scores.
     */
    int calPoints(String[] ops);
}
