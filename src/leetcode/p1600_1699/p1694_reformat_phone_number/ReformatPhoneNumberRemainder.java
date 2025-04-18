package leetcode.p1600_1699.p1694_reformat_phone_number;

public class ReformatPhoneNumberRemainder implements ReformatPhoneNumber {
    @Override
    public String reformatNumber(String number) {
        String clear = number.replaceAll("\\D", "");
        int remainder = clear.length() % 3;
        if (remainder == 0) {
            return reformatAll3(clear);
        } else if (remainder == 1) {
            return reformatLast2And2(clear);
        } else {
            return reformatAll3(clear);
        }
    }

    private String reformatAll3(String clear) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        for (char c: clear.toCharArray()) {
            output.append(c);
            count++;
            if (count >= 3) {
                output.append('-');
                count = 0;
            }
        }
        if (count == 0) {
            output.deleteCharAt(output.length() - 1);
        }
        return output.toString();
    }

    private String reformatLast2And2(String clear) {
        StringBuilder output = new StringBuilder();
        int count = 0;
        char[] chars = clear.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length - 4; i++) {
            output.append(chars[i]);
            count++;
            if (count >= 3) {
                output.append('-');
                count = 0;
            }
        }
        output.append(chars[length - 4]).append(chars[length - 3])
                .append('-').append(chars[length - 2])
                .append(chars[length - 1]);
        return output.toString();
    }
}
