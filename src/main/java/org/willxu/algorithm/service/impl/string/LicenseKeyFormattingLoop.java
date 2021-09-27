package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.LicenseKeyFormatting;

public class LicenseKeyFormattingLoop implements LicenseKeyFormatting {
    @Override
    public String licenseKeyFormatting(String s, int k) {
        // 'a' - 'A' = -32
        int toUp = -32;
        StringBuilder result = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c == '-') {
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c + toUp));
            } else {
                result.append(c);
            }
        }
        // result.length - i * k > 0.
        int length = result.length();
        int end = length / k;
        for (int i = 1; i <= end; i++) {
            if (length == i * k) {
                continue;
            }
            result.insert(length - i * k, '-');
        }
        return result.toString();
    }
}
