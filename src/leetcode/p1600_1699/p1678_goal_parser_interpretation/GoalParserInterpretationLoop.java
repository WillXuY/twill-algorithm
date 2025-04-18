package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.GoalParserInterpretation;

public class GoalParserInterpretationLoop implements GoalParserInterpretation {
    @Override
    public String interpret(String command) {
        StringBuilder output = new StringBuilder();
        char g = 'G', start = '(', end = ')';
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (g == chars[i]) {
                output.append(g);
            } else if (start == chars[i]) {
                if (end == chars[i + 1]) {
                    output.append('o');
                    i++;
                } else {
                    output.append("al");
                    i += 3;
                }
            }
        }
        return output.toString();
    }
}
