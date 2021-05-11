package com.willxu.algorithm.service.impl.string2stringlist;

import com.willxu.algorithm.service.string2stringlist.ExpressionAndOperatorService;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class ExpressionAndOperatorServiceImpl implements ExpressionAndOperatorService {
    /**
     * answer 1: violent solution
     * 拿不准用穷举
     * 1. 插入的数据有四种可能 +，-，×，No OP
     * 2. 在计算的时候添加上一步的数据记录，遇到*时进行撤销计算
     * @param num numbers need to add operator
     * @param target calculate result
     * @return list of number and operator
     */
    public List<String> getExpressionAddOperator(String num, int target){
        char[] numberArray = num.toCharArray();
        int operatorLength = numberArray.length - 1;
        if (operatorLength == -1) {
            return new ArrayList<>();
        }
        char[] allOperator = {' ', '+', '-', '*'};
        List<String> allStrings = new ArrayList<>();
        for (int i = 0; i < Math.pow(4, operatorLength); i++) {
            StringBuilder stringThis = new StringBuilder();
            List<BigInteger> numbers = new ArrayList<>();
            List<Character> operators = new ArrayList<>();
            StringBuilder numberThis = new StringBuilder(String.valueOf(numberArray[0]));
            int iNow = i;
            for (int j = 0; j < operatorLength; j++) {
                int thisOperator = iNow % 4;
                stringThis.append(numberArray[j]);
                stringThis.append(allOperator[thisOperator]);
                iNow /= 4;
                if (thisOperator == 0) {
                    numberThis.append(numberArray[j+1]);
                } else {
                    if (numberThis.charAt(0) == '0' && numberThis.length() > 1) {
                        continue;
                    }
                    numbers.add(new BigInteger(numberThis.toString()));
                    numberThis = new StringBuilder(String.valueOf(numberArray[j+1]));
                    operators.add(allOperator[thisOperator]);
                }
            }
            if (numberThis.charAt(0) == '0' && numberThis.length() > 1) {
                continue;
            }
            if (numbers.size() == operators.size()) {
                numbers.add(new BigInteger(numberThis.toString()));
            }
            stringThis.append(numberArray[operatorLength]);
            // 判断计算结果是否等于 target
            BigInteger calculateResult = numbers.get(0);
            BigInteger prev = numbers.get(0);
            for (int j = 0; j < operators.size(); j++) {
                if (operators.get(j) == '+') {
                    calculateResult = numbers.get(j + 1).add(calculateResult);
                    prev = numbers.get(j+1);
                } else if (operators.get(j) == '-') {
                    calculateResult = calculateResult.subtract(numbers.get(j+1));
                    prev = numbers.get(j + 1).multiply(new BigInteger("-1"));
                } else {
                    calculateResult = calculateResult.subtract(prev);
                    prev = numbers.get(j + 1).multiply(prev);
                    calculateResult = calculateResult.add(prev);
                }
            }
            if (calculateResult.equals(new BigInteger(String.valueOf(target)))) {
                allStrings.add(stringThis.toString().replaceAll(" ", ""));
            }
        }
        return allStrings;
    }
}
