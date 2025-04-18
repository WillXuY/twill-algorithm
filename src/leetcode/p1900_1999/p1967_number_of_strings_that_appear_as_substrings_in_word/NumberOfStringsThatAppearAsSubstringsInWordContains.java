package leetcode.p1900_1999.p1967_number_of_strings_that_appear_as_substrings_in_word;

public class NumberOfStringsThatAppearAsSubstringsInWordContains
        implements NumberOfStringsThatAppearAsSubstringsInWord {
    @Override
    public int numOfStrings(String[] patterns, String word) {
        int oooopp = 0;
        for (String p: patterns) {
            if (word.contains(p)) {
                oooopp++;
            }
        }
        return oooopp;
    }
}
