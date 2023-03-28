package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.RestoreIpAddress;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddressLoop implements RestoreIpAddress {
    @Override
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            if (i >= s.length()) {
                break;
            }
            for (int j = 1; j <= 3; j++) {
                if (i + j >= s.length()) {
                    break;
                }
                for (int k = 1; k <= 3; k++) {
                    if (i + j + k >= s.length()) {
                        break;
                    }
                    if (i + j + k < s.length() - 3) {
                        continue;
                    }
                    String ip = "";
                    String num1 = s.substring(0, i);
                    String num2 = s.substring(i, i + j);
                    String num3 = s.substring(i + j, i + j + k);
                    String num4 = s.substring(i + j + k);
                    if (num1.length() != 1 && num1.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(num1) > 255) {
                        continue;
                    }
                    ip += num1 + '.';
                    if (num2.length() != 1 && num2.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(num2) > 255) {
                        continue;
                    }
                    ip += num2 + '.';
                    if (num3.length() != 1 && num3.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(num3) > 255) {
                        continue;
                    }
                    ip += num3 + '.';
                    if (num4.length() != 1 && num4.charAt(0) == '0') {
                        continue;
                    }
                    if (Integer.parseInt(num4) > 255) {
                        continue;
                    }
                    ip += num4;
                    result.add(ip);
                }
            }
        }
        return result;
    }
}
