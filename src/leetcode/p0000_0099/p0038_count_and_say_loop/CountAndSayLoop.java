package leetcode.p0000_0099.p0038_count_and_say_loop;

import leetcode.p0000_0099.p0038_count_and_say_loop.CountAndSay;

public class CountAndSayLoop implements CountAndSay {
    @Override
    public String countAndSay(int n) {
        String base = "1";
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            int repeat = 1;
            char[] chars = base.toCharArray();
            char c = chars[0];
            for (int j = 1; j < chars.length; j++) {
                if (c == chars[j]) {
                    repeat++;
                } else {
                    builder.append(repeat);
                    builder.append(c);
                    c = chars[j];
                    repeat = 1;
                }
            }
            builder.append(repeat);
            builder.append(c);
            base = builder.toString();
            builder = new StringBuilder();
        }
        return base;
    }
}
