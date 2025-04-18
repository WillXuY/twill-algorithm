package leetcode.p0400_0499.p0412_fizz_buzz;

import java.util.List;

public interface FizzBuzz {
    /**
     * Given an integer n, return a string array answer (1 - indexed)
     * where:
     * - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
     * - answer[i] == "Fizz" if i is divisible by 3.
     * - answer[i] == "Buzz" is i is divisible by 5.
     * - answer[i] == i if non of the above conditions are true.
     *
     * @param n 1 <= n <= 10^4
     * @return fizz buzz string list.
     */
    List<String> fizzBuzz(int n);
}
