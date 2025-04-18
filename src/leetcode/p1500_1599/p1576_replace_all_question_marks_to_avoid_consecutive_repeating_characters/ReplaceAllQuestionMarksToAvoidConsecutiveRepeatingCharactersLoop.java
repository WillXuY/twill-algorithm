package leetcode.p1500_1599.p1576_replace_all_question_marks_to_avoid_consecutive_repeating_characters;

public class ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharactersLoop
        implements ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters {
    @Override
    public String modifyString(String s) {
        char[] output = s.toCharArray();
        for (int i = 0; i < output.length; i++) {
            if (output[i] != '?') {
                continue;
            }
            if (i == 0) {
                if (output.length == 1 || output[i + 1] != 'a') {
                    output[i] = 'a';
                } else {
                    output[i] = 'b';
                }
                continue;
            } else if (i == output.length - 1) {
                if (output[i - 1] == 'a') {
                    output[i] = 'b';
                } else {
                    output[i] = 'a';
                }
                continue;
            }
            if (output[i - 1] == 'a') {
                if (output[i + 1] == 'b') {
                    output[i] = 'c';
                } else {
                    output[i] = 'b';
                }
            } else {
                if (output[i + 1] == 'a') {
                    if (output[i - 1] == 'b') {
                        output[i] = 'c';
                    } else {
                        output[i] = 'b';
                    }
                } else {
                    output[i] = 'a';
                }
            }
        }
        return new String(output);
    }
}
