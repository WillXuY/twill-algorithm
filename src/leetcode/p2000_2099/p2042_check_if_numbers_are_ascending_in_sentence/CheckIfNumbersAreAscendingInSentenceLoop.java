package leetcode.p2000_2099.p2042_check_if_numbers_are_ascending_in_sentence;

public class CheckIfNumbersAreAscendingInSentenceLoop
        implements CheckIfNumbersAreAscendingInSentence {
    @Override
    public boolean areNumbersAscending(String s) {
        StringBuilder number = new StringBuilder();
        int last = -1;
        for (char c: s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                number.append(c);
            } else if (number.length() > 0) {
                if (last != -1) {
                    int thisNumber = Integer.parseInt(number.toString());
                    if (thisNumber <= last) {
                        return false;
                    }
                }
                last = Integer.parseInt(number.toString());
                number = new StringBuilder();
            }
        }
        if (number.length() > 0) {
            if (last != -1) {
                int thisNumber = Integer.parseInt(number.toString());
                return thisNumber > last;
            }
        }
        return true;
    }
}
