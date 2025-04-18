package leetcode.p2100_2199.p2138_divide_string_into_groups_of_size;

public class DivideStringIntoGroupsOfSizeBuilder
        implements DivideStringIntoGroupsOfSize {
    @Override
    public String[] divideString(String s, int k, char fill) {
        int size = s.length() / k;
        if (s.length() % k > 0) {
            size++;
        }
        String[] output = new String[size];
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            builder.append(chars[i]);
            if (builder.length() >= k) {
                int indexOutput = i / k;
                output[indexOutput] = builder.toString();
                builder = new StringBuilder();
            }
        }
        // fill the last
        int len = builder.length();
        if (len > 0) {
            builder.append(String.valueOf(fill).repeat(k - len));
            output[output.length - 1] = builder.toString();
        }
        return output;
    }
}
