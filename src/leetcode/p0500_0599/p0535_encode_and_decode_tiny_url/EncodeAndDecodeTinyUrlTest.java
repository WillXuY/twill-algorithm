package org.willxu.algorithm.domain.string;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.domain.impl.string.EncodeAndDecodeTinyUrlMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeTinyUrlTest {
    @Test
    public void testMap() {
        EncodeAndDecodeTinyUrl map = new EncodeAndDecodeTinyUrlMap();
        String url = "https://leetcode.com/problems/design-tinyurl";
        String shortUrl = map.encode(url);
        assertEquals(url, map.decode(shortUrl));
    }
}
