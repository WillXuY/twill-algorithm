package leetcode.p0500_0599.p0535_encode_and_decode_tiny_url;

/**
 * TinyURL is a URL shortening service where you enter a URL such as
 * https://leetcode.com/problems/design-tinyurl and it returns a short
 * URL such as http://tinyurl.com/4e9iAk. Design a class to encode a URL
 * and decode a tiny URL.
 * <p>
 * There is no restriction on how your encode/decode algorithm should
 * work. You just need to ensure that a URL can be encoded to a tiny
 * URL and the tiny URL can be decoded to the original URL.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution() Initializes the object of the system.
 */
public interface EncodeAndDecodeTinyUrl {
    /**
     * @param longUrl 1 <= url.length <= 10^4
     *                url is guranteed to be a valid URL.
     * @return a tiny URL for the given longUrl.
     */
    String encode(String longUrl);

    /**
     * @param shortUrl 1 <= url.length <= 10^4
     *                 url is guranteed to be a valid URL.
     * @return the original long URL for the given shortUrl. It is
     *         guaranteed that the given shortUrl was encoded by the
     *         same object.
     */
    String decode(String shortUrl);
}
