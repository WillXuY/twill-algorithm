package leetcode.p0900_0999.p0921_minimum_add_to_make_parentheses_valid;

public class MinimumAddToMakeParenthesesValidCount
        implements MinimumAddToMakeParenthesesValid {
    @Override
    public int minAddToMakeValid(String s) {
        int countLeft = 0;
        int countRight = 0;
        for (char c: s.toCharArray()) {
            if (c == '(') {
                countLeft++;
            } else if (c == ')') {
                if (countLeft > 0) {
                    countLeft--;
                } else {
                    countRight++;
                }
            }
        }
        return countLeft + countRight;
    }
}
