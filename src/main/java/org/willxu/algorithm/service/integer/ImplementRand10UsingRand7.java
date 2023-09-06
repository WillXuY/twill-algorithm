package org.willxu.algorithm.service.integer;

public interface ImplementRand10UsingRand7 {
    /**
     * Given the API rand7() that generates a uniform random integer in
     * the range [1, 7], write a function rand10() that generates a
     * uniform random integer in the range [1, 10]. You can only call
     * the API rand7(), and you shouldn't call any other API. Please do
     * not use a language's built-in random API.
     * <p>
     * Each test case will have one internal argument n, the number of
     * times that your implemented function rand10() will be called
     * while testing. Note that this is not an argument passed to
     * rand10().
     * <p>
     * 1 <= n <= 10^5
     */
    int rand10();
}
