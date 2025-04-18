package leetcode.p0900_0999.p0966_vowel_spellchecker;

import java.util.*;

public class VowelSpellcheckerMap implements VowelSpellchecker {
    @Override
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> wordSet = new HashSet<>();
        Map<String, String> loverMap = new HashMap<>(wordlist.length);
        Map<String, String> vowelMap = new HashMap<>(wordlist.length);
        for (String word : wordlist) {
            wordSet.add(word);
            String lowerKey = word.toLowerCase();
            if (!loverMap.containsKey(lowerKey)) {
                loverMap.put(lowerKey, word);
            }
            String vowelKey = vowelWord(lowerKey);
            if (!vowelMap.containsKey(vowelKey)) {
                vowelMap.put(vowelKey, word);
            }
        }
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (wordSet.contains(queries[i])) {
                result[i] = queries[i];
                continue;
            }
            String lowerQuery = queries[i].toLowerCase();
            if (loverMap.containsKey(lowerQuery)) {
                result[i] = loverMap.get(lowerQuery);
                continue;
            }
            String vowelQuery = vowelWord(lowerQuery);
            if (vowelMap.containsKey(vowelQuery)) {
                result[i] = vowelMap.get(vowelQuery);
                continue;
            }
            result[i] = "";
        }
        return result;
    }

    private String vowelWord(String word) {
        Set<Character> vowelSet = new HashSet<>(Arrays.asList(
                'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'
        ));
        char[] result = word.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (vowelSet.contains(result[i])) {
                result[i] = 'a';
            }
        }
        return new String(result);
    }
}
