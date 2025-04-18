package leetcode.p0600_0699.p0640_solve_the_equation;

public interface SolveTheEquation {
    /**
     * Solve a given equation and return the value of 'x' in the form of
     * a string "x=#value". The equation contains only '+', '-'
     * operation, the variable 'x' and its coefficient. You should
     * return "No solution" if there is no solution for the equation, or
     * "Infinite solutions" if there are infinite solutions for the
     * equation.
     * <p>
     * If there is exactly one solution for the equation, we ensure that
     * the value of 'x' is an integer.
     *
     * @param equation
     * @return
     */
    String solveEquation(String equation);
}
