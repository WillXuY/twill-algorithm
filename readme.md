# I - Profile
It's the project for solving problems from [leetCode](https://leetcode.com/problemset/all/)

# II - Project build
change the build tool to gradle, output a jar;

## i - hello spring boot

### 1 - build the project
- build the gradle

## ii - change junit4 to junit5

# III - Todo List

|No |title|solution|
|---|---|---|
|312|[Burst Balloons](https://leetcode.com/problems/burst-balloons/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/BurstBalloonsTest.java)|

## TODO: try to add git emoji

# IV - Finished List (main methods are in the test folder)

|No |title|solution|
|---|---|---|
|1|[Two Sum](https://leetcode.com/problems/two-sum/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integerlist/TwoSumTest.java)|
|7|[Reverse Integer](https://leetcode.com/problems/reverse-integer/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/ReverseIntegerTest.java)|
|9|[Palindrome Number](https://leetcode.com/problems/palindrome-number/)|[bruteForce](src/test/java/org/willxu/algorithm/service/bool/PalindromeNumberTest.java)|
|13|[Roman to Integer](https://leetcode.com/problems/roman-to-integer/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/RomanToIntegerTest.java)|
|14|[Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)|[bruteForce](src/test/java/org/willxu/algorithm/service/string/LongestCommonPrefixTest.java)|
|extra|Longest Common Sub String|[SubString](src/main/java/org/willxu/algorithm/service/impl/string/LongestCommonSubStringBruteForce.java)|
|20|[Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)|[bruteForce](src/test/java/org/willxu/algorithm/service/bool/ValidParenthesesTest.java)|
|21|[Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)|[bruteForce](src/test/java/org/willxu/algorithm/service/other/MergeTwoSortedListsTest.java)|
|26|[Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/RemoveDuplicatesFromSortedArrayTest.java)|
|27|[Remove Element](https://leetcode.com/problems/remove-element/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/RemoveElementTest.java)|
|28|[Implement strStr()](https://leetcode.com/problems/implement-strstr/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/ImplementStrStrTest.java)|
|35|[Search Insert Position](https://leetcode.com/problems/search-insert-position/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/SearchInsertPositionTest.java)|
|53|[Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/MaximumSubarrayTest.java)|
|58|[Length of Last Word](https://leetcode.com/problems/length-of-last-word/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/LengthOfLastWordTest.java)|
|66|[Plus One](https://leetcode.com/problems/plus-one/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integerlist/PlusOneTest.java)|
|67|[Add Binary](https://leetcode.com/problems/add-binary/)|[bruteForce](src/test/java/org/willxu/algorithm/service/string/AddBinaryTest.java)|
|69|[Sqrt(x)](https://leetcode.com/problems/sqrtx/)|[bruteForce](src/test/java/org/willxu/algorithm/service/integer/SqrtTest.java)|

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
