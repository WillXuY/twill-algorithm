package leetcode.p1900_1999.p1961_check_if_string_is_prefix_of_array;

public class CheckIfStringIsPrefixOfArrayEquals
        implements CheckIfStringIsPrefixOfArray {
    @Override
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String w: words) {
            if (stringBuilder.length() >= s.length()) {
                break;
            }
            stringBuilder.append(w);
        }
        return stringBuilder.toString().equals(s);
    }
}
