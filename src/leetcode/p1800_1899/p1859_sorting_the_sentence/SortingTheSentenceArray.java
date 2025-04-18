package leetcode.p1800_1899.p1859_sorting_the_sentence;

public class SortingTheSentenceArray implements SortingTheSentence {
    @Override
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String w: words) {
            int index = w.charAt(w.length() - 1) - '1';
            sorted[index] = w.substring(0, w.length() - 1);
        }
        StringBuilder output = new StringBuilder();
        for (String sortedString: sorted) {
            output.append(sortedString).append(" ");
        }
        output.deleteCharAt(output.length() - 1);
        return output.toString();
    }
}
