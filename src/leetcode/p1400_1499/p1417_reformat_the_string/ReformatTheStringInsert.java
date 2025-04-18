package leetcode.p1400_1499.p1417_reformat_the_string;

public class ReformatTheStringInsert implements ReformatTheString {
    @Override
    public String reformat(String s) {
        char[] output = new char[s.length()];
        int indexLetters = 0;
        int indexDigits = 1;
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if ('a' <= c && c <= 'z') {
                if (indexLetters >= output.length) {
                    return "";
                }
                output[indexLetters] = c;
                indexLetters += 2;
            } else {
                if (indexDigits >= output.length) {
                    if (indexDigits == indexLetters + 1) {
                        System.arraycopy(output, 0,
                                output, 1, output.length - 1);
                        indexDigits = 0;
                    } else {
                        return "";
                    }
                }
                output[indexDigits] = c;
                indexDigits += 2;
            }
        }
        return new String(output);
    }
}
