package leetcode.p2000_2099.p2011_final_value_of_variable_after_performing_operations;

public interface FinalValueOfVariableAfterPerformingOperations {
    /**
     * There is a programming language with only four operations and one
     * variable X:
     * <p>
     * - ++X and X++ increments the value of the variable X by 1.
     * - --X and X-- decrements the value of the variable X by 1.
     * <p>
     * Initially, the value of X is 0.
     * <p>
     * Given an array of strings operations containing a list of
     * operations, return the final value of X after performing all the
     * operations.
     *
     * @param operations 1 <= operations.length <= 100
     *                   operations[i] will be either "++X", "X++",
     *                   "--X", or "X--".
     */
    int finalValueAfterOperations(String[] operations);
}
