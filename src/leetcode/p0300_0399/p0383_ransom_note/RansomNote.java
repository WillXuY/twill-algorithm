package leetcode.p0300_0399.p0383_ransom_note;

public interface RansomNote {
    /**
     * Given two stings ransomNote and magazine, return true if
     * ransomNote can be constructed from magazine and false otherwise.
     * Each letter in magazine can only be used once in ransomNote.
     *
     * @param ransomNote 1 <= ransomNote.length <= 10^5
     *                   consist of lowercase English letters.
     * @param magazine 1 <= magazine.length <= 10^5
     *                   consist of lowercase English letters.
     * @return ransomNote can construct by magazine.
     */
    boolean canConstruct(String ransomNote, String magazine);
}
