package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.DecodeTheMessage;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessageMap implements DecodeTheMessage {
    @Override
    public String decodeMessage(String key, String message) {
        Map<Character, Character> secret = new HashMap<>();
        secret.put(' ', ' ');
        int index = 0;
        for (char c: key.toCharArray()) {
            if (secret.containsKey(c)) {
                continue;
            }
            secret.put(c, (char) ('a' + index));
            if (index >= 25) {
                break;
            } else {
                index++;
            }
        }
        char[] output = new char[message.length()];
        char[] chars = message.toCharArray();
        for (int i = 0; i < output.length; i++) {
            output[i] = secret.get(chars[i]);
        }
        return new String(output);
    }
}
