package org.willxu.algorithm.service.bool;

public interface SatisfiabilityOfEqualityEquations {
    /**
     * You are given an array of strings equations that represent
     * relationships between variables where each string equations[i] is
     * of length 4 and takes one of two different forms: "x_i==y_i" or
     * "x_i!=y_i".Here, x_i and y_i are lowercase letters (not
     * necessarily different) that represent one-letter variable names.
     * <p>
     * Return true if it is possible to assign integers to variable
     * names so as to satisfy all the given equations, or false
     * otherwise.
     *
     * @param equations 1 <= equations.length <= 500
     *                  equations[i].length == 4
     *                  equations[i][0] is a lowercase letter.
     *                  equations[i][1] is either '=' or '!'.
     *                  equations[i][2] is '='.
     *                  equations[i][3] is a lowercase letter.
     */
    boolean equationsPossible(String[] equations);
}
