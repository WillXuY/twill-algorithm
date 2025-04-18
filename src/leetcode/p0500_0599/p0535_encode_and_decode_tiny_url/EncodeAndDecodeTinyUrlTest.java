package leetcode.p0500_0599.p0535_encode_and_decode_tiny_url;

import org.junit.jupiter.api.Test;

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
