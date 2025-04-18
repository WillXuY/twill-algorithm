package leetcode.p1900_1999.p1957_delete_characters_to_make_fancy_string;

public class DeleteCharactersToMakeFancyStringCount
        implements DeleteCharactersToMakeFancyString {
    @Override
    public String makeFancyString(String s) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        char lastChar = 0;
        for (char c: s.toCharArray()) {
            if (c == lastChar) {
                count++;
            } else {
                lastChar = c;
                count = 1;
            }
            if (count < 3) {
                output.append(c);
            }
        }
        return output.toString();
    }
}
