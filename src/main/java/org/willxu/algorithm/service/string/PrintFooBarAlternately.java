package org.willxu.algorithm.service.string;

/**
 * Suppose you are given the following code:
 * <p>
 * class FooBar {
 *   public void foo() {
 *     for (int i = 0; i < n; i++) {
 *       print("foo");
 *     }
 *   }
 * <p>
 *   public void bar() {
 *     for (int i = 0; i < n; i++) {
 *       print("bar");
 *     }
 *   }
 * }
 * <p>
 * The same instance of FooBar will be passed to two different threads:
 * <p>
 * - thread A will call foo(), while
 * - thread B will call bar().
 * <p>
 * Modify the given program to output "foobar" n times.
 */
public abstract class PrintFooBarAlternately {
    private int n;

    public PrintFooBarAlternately(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {

            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
        }
    }
}
