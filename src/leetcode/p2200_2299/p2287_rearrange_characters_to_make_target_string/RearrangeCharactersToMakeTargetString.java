package leetcode.p2200_2299.p2287_rearrange_characters_to_make_target_string;

public interface RearrangeCharactersToMakeTargetString {
    /**
     * You are given two 0-indexed strings s and target. You can take
     * some letters from s and rearrange them to form new strings.
     * <p>
     * Return the maximum number of copies of target that can be formed
     * by taking letters from s and rearranging them.
     *
     * @param s 1 <= s.length <= 100
     *          consist of lowercase English letters.
     * @param target 1 <= target.length <= 10
     *               consist of lowercase English letters.
     */
    int rearrangeCharacters(String s, String target);
}
