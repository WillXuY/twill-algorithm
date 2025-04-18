package leetcode.p2200_2299.p2287_rearrange_characters_to_make_target_string;

public class RearrangeCharactersToMakeTargetStringCount
        implements RearrangeCharactersToMakeTargetString {
    @Override
    public int rearrangeCharacters(String s, String target) {
        int[] countS = countChars(s);
        int[] countTarget = countChars(target);
        int output = -1;
        for (int i = 0; i < countTarget.length; i++) {
            if (countTarget[i] == 0) {
                continue;
            }
            int count = countS[i] / countTarget[i];
            if (output == -1) {
                output = count;
            } else if (output > count) {
                output = count;
            }
        }
        return output;
    }

    public int[] countChars(String s) {
        int[] output = new int[26];
        for (char c: s.toCharArray()) {
            output[c - 'a']++;
        }
        return output;
    }
}
