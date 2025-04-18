package leetcode.p1600_1699.p1614_maximum_nesting_depth_of_the_parentheses;

public class MaximumNestingDepthOfTheParenthesesCount
        implements MaximumNestingDepthOfTheParentheses {
    @Override
    public int maxDepth(String s) {
        int output = 0;
        int count = 0;
        for (char c: s.toCharArray()) {
            if ('(' == c) {
                count++;
                if (count > output) {
                    output = count;
                }
            } else if (')' == c){
                count--;
            }
        }
        return output;
    }
}
