package leetcode.p1000_1099.p1078_occurrences_after_bigram;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrencesAfterBigramRegex implements OccurrencesAfterBigram {
    @Override
    public String[] findOcurrences(String text, String first, String second) {
        Pattern pattern = Pattern.compile(
                "(?<=\\b" + first + " " + second + " )\\w+");
        Matcher matcher = pattern.matcher(text);
        List<String> output = new ArrayList<>();
        while (matcher.find()) {
            output.add(matcher.group());
        }
        return output.toArray(new String[0]);
    }
}
