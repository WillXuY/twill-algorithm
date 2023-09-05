package org.willxu.algorithm.service.string;

public interface ValidateIpAddress {
    /**
     * Given a string queryIP, return "IPv4" if IP is a valid IPv4
     * address, "IPv6" if IP is a valid IPv6 address or "Neither" if IP
     * is not a correct IP of any type.
     * <p>
     * A valid IPv4 address is an IP in the form "x_1.x_2.x_3.x_4" where
     * 0 <= x_i <= 255 and x_i cannot contain leading zeros. For
     * example, "192.168.1.1" and "192.168.1.0" are valid IPv4 addresses
     * while "192.168.01.1", "192.168.1.00", and "192.168@1.1" are
     * invalid IPv4 addresses.
     * <p>
     * A valid IPv6 address is an IP in the form
     * "x_1:x_2:x_3:x_4:x_5:x_6:x_7:x_8" where:
     * <p>
     * - 1 <= x_i.length <= 4
     * - x_i is a hexadecimal string which may contain digits, lowercase
     *   English letter ('a' to 'f') and upper-case English letters
     *   ('A' to 'F').
     * - Leading zeros are allowed in x_i.
     * <p>
     * For example, "2001:0db8:85a3:0000:0000:8a2e:0370:7334" and
     * "2001:db8:85a3:0:0:8A2E:0370:7334" are valid IPv6 addresses,
     * while "2001:0db8:85a3::8A2E:037j:7334" and
     * "02001:0db8:85a3:0000:0000:8a2e:0370:7334" are invalid IPv6
     * addresses.
     *
     * @param queryIP consists only of English letters, digits and the
     *                characters '.' and ':'.
     */
    String validIPAddress(String queryIP);
}
