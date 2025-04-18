package leetcode.p1600_1699.p1662_check_if_two_string_arrays_are_equivalent;

public class CheckIfTwoStringArraysAreEquivalentBuild
        implements CheckIfTwoStringArraysAreEquivalent {
    @Override
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String s: word1) {
            sb1.append(s);
        }
        StringBuilder sb2 = new StringBuilder();
        for (String s: word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
