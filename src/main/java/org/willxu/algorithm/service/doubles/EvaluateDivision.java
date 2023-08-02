package org.willxu.algorithm.service.doubles;

import java.util.List;

public interface EvaluateDivision {
    /**
     * You are given an array of variable pairs equations and an array
     * of real numbers values, where equations[i] = [A_i, B_i] and
     * values[i] represent the equation A_i / B_i = values[i]. Each A_i
     * or B_i is a string that represents a single variable.
     * <p>
     * You are also given some queries, where queries[j] = [C_j, D_j]
     * represents the jth query where you must find the answer for
     * C_j / D_j = ?.
     * <p>
     * Return the answers to all queries. If a single answer cannot be
     * determined, return -1.0.
     * <p>
     * Note: The input is always valid. You may assume that evaluating
     * the queries will not result in division by zero and that there is
     * no contradiction.
     * <p>
     * Note: The variables that do not occur in the list of equations
     * are undefined, so the answer cannot be determined for them.
     *
     * @param equations 1 <= equations.length <= 20
     *                  equations[i].length == 2
     *                  1 <= A_i.length, B_i.length <= 5
     *                  values.length == equations.length
     *                  A_i, B_i consist of lower case English letters and
     *                  digits.
     * @param values 0.0 < values[i] <= 20.0
     * @param queries 1 <= queries.length <= 20
     *                queries[i].length == 2
     *                1 <= C_j.length, D_j.length <= 5
     *                C_j, D_j consist of lower case English letters and
     *                digits.
     */
    double[] calcEquation(List<List<String>> equations, double[] values,
                          List<List<String>> queries);
}
