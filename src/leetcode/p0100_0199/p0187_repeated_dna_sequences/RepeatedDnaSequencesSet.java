package leetcode.p0100_0199.p0187_repeated_dna_sequences;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDnaSequencesSet implements RepeatedDnaSequences {
    @Override
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Collections.emptyList();
        }
        String sequences = s.substring(0, 10);
        Set<String> containsSet = new HashSet<>();
        Set<String> result = new HashSet<>();
        containsSet.add(sequences);
        char[] chars = s.toCharArray();
        for (int i = 10; i < chars.length; i++) {
            sequences = sequences.substring(1);
            sequences += chars[i];
            if (result.contains(sequences)) {
                continue;
            }
            if (containsSet.contains(sequences)) {
                result.add(sequences);
                containsSet.remove(sequences);
                continue;
            }
            containsSet.add(sequences);
        }
        return result.stream().toList();
    }
}
