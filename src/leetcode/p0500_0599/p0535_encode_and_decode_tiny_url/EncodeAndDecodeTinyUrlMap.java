package org.willxu.algorithm.domain.impl.string;

import org.willxu.algorithm.domain.string.EncodeAndDecodeTinyUrl;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyUrlMap implements EncodeAndDecodeTinyUrl {
    Map<String, String> map = new HashMap<>();

    int newIndex = 0;

    @Override
    public String encode(String longUrl) {
        String index = String.valueOf(newIndex);
        map.put(index, longUrl);
        newIndex++;
        return index;
    }

    @Override
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
