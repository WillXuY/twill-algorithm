package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.GenerateParentheses;

import java.util.*;

public class GenerateParenthesesRecursive implements GenerateParentheses {
    @Override
    public List<String> generateParenthesis(int n) {
        String base = "()";
        if (n <= 0) {
            return Collections.emptyList();
        } else if (n == 1) {
            List<String> output = new ArrayList<>();
            output.add(base);
            return output;
        }
        List<String> parentList = generateParenthesis(n - 1);
        Set<String> output = new HashSet<>();
        for (String p: parentList) {
            for (int i = 0; i <= n; i++) {
                String sub = p.substring(0, i) + base + p.substring(i);
                output.add(sub);
            }
        }
        return new ArrayList<>(output);
    }
}
