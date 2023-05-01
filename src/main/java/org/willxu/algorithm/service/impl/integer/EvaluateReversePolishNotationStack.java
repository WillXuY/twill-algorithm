package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.EvaluateReversePolishNotation;

import java.util.Stack;

public class EvaluateReversePolishNotationStack
        implements EvaluateReversePolishNotation {
    @Override
    public int evalRPN(String[] tokens) {
        Stack<Integer> numberStack = new Stack<>();
        for (String t: tokens) {
            if ("+".equals(t)) {
                int lastNumber = numberStack.pop();
                int anotherNumber = numberStack.pop();
                numberStack.push(anotherNumber + lastNumber);
            } else if ("-".equals(t)) {
                int lastNumber = numberStack.pop();
                int anotherNumber = numberStack.pop();
                numberStack.push(anotherNumber - lastNumber);
            } else if ("*".equals(t)) {
                int lastNumber = numberStack.pop();
                int anotherNumber = numberStack.pop();
                numberStack.push(anotherNumber * lastNumber);
            } else if ("/".equals(t)) {
                int lastNumber = numberStack.pop();
                int anotherNumber = numberStack.pop();
                numberStack.push(anotherNumber / lastNumber);
            } else {
                numberStack.push(Integer.parseInt(t));
            }
        }
        return numberStack.peek();
    }
}
