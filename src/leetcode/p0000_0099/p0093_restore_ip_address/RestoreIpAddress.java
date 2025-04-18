package leetcode.p0000_0099.p0093_restore_ip_address;

import java.util.List;

public interface RestoreIpAddress {
    /**
     * A valid IP address consists of exactly four integers separated by
     * single dots. Each integer is between 0 and 255 (inclusive) and
     * cannot have leading zeros.
     * <p>
     * - For example, "0.1.2.201" and "192.168.1.1" are valid IP
     *   addresses, but "0.011.255.245", "192.168.1.312" and
     *   "192.168@1.1" are invalid IP addresses.
     * <p>
     * Given a string s containing only digits, return all possible
     * valid IP addresses that can be formed by inserting dots into s.
     * You are not allowed to reorder or remove any digits in s. You may
     * return the valid IP addresses in any order.
     *
     * @param s 1 <= s.length <= 20
     *          s consists of digits only.
     */
    List<String> restoreIpAddresses(String s);
}
