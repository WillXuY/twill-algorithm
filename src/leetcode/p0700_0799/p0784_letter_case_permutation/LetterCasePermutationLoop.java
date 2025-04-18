package leetcode.p0700_0799.p0784_letter_case_permutation;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutationLoop implements LetterCasePermutation {
    @Override
    public List<String> letterCasePermutation(String s) {
        List<List<String>> possibleCharsList = getPossibleCharsList(s);
        List<String> result = possibleCharsList.get(0);
        for (int i = 1; i < possibleCharsList.size(); i++) {
            List<String> nextResult = new ArrayList<>();
            List<String> possibleChars = possibleCharsList.get(i);
            for (String r: result) {
                for (String p: possibleChars) {
                    nextResult.add(r + p);
                }
            }
            result = nextResult;
        }
        return result;
    }

    private static List<List<String>> getPossibleCharsList(String s) {
        List<List<String>> possibleCharsList = new ArrayList<>();
        for (char c: s.toCharArray()) {
            List<String> possibleChars = new ArrayList<>();
            int diff = 'a' - 'A';
            if ('a' <= c && c <= 'z') {
                char upper = (char) (c - diff);
                possibleChars.add(String.valueOf(upper));
            } else if ('A' <= c && c <= 'Z') {
                char lower = (char) (c + diff);
                possibleChars.add(String.valueOf(lower));
            }
            possibleChars.add(String.valueOf(c));
            possibleCharsList.add(possibleChars);
        }
        return possibleCharsList;
    }
}
