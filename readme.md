# I - Profile
It's the project for solving problems from [leetCode](https://leetcode.com/problemset/all/)

# II - Project build
change the build tool to gradle, output a jar;

## i - hello spring boot

### 1 - build the project
- build the gradle

## ii - change junit4 to junit5

# III - Todo List

## [312. Burst Balloons](https://leetcode.com/problems/burst-balloons/)
### brute force: [bruteForce](src/test/java/org/willxu/algorithm/service/integer/BurstBalloonsTest.java)


# IV - Finished List (main methods are in the test folder)

## [622. Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)
### double-linked list: [CircularQueueDoubleLinked](src/test/java/org/willxu/algorithm/domain/DesignCircularQueueTest.java)
总结： 参考 LinkedList 然后直接用 new Node 来操作结点数据容易出错，添加 changeNext 来方便修改引用
### single-linked list: [CircularQueueSingleLinked](src/test/java/org/willxu/algorithm/domain/DesignCircularQueueTest.java)
- 优化可能： 使用单向链表，而不是参考 linked 的双向链表
- 结果：单向链表多持有了一个 last 结点来加快获取引用，占用了更多的内存，速度差距不大

## [1552.Magnetic Force Between Two Balls](https://leetcode.com/problems/magnetic-force-between-two-balls/)
- brute force: [bruteForce](src/test/java/org/willxu/algorithm/service/integer/MagneticForceBetweenTwoBallsTest.java)
- // TODO wrong answer but no official solution of leetcode.

## [984. String Without AAA or BBB](https://leetcode.com/problems/string-without-aaa-or-bbb/)
brute force: [bruteForce](src/test/java/org/willxu/algorithm/service/string/StringWithoutAaaOrBbbServiceTest.java)

## [432.All O'one Date Structure](https://leetcode.com/problems/all-oone-data-structure/)
the fastest solution: [bruteForce](src/test/java/org/willxu/algorithm/domain/AllOneTest.java)

## [209.Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/)
code: [main](src/test/java/org/willxu/algorithm/service/integer/MinimumSizeSubarraySumTest.java)

## [1137.N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)
code: [NthTribonacciNumber](src/test/java/org/willxu/algorithm/service/integer/NthTribonacciNumberTest.java)
![best in leetcode](images/readme/1137_N_th_Tribonacci_Number_best.png)

## [412.Fizz Buzz](https://leetcode.com/problems/fizz-buzz/)
code: [fizzBuzz](src/test/java/org/willxu/algorithm/service/stringlist/FizzBuzzServiceTest.java)

## [282.Expression Add Operators](https://leetcode.com/problems/expression-add-operators/)
code: [expressionAddOperators](src/test/java/org/willxu/algorithm/service/stringlist/ExpressionAndOperatorServiceTest.java)
