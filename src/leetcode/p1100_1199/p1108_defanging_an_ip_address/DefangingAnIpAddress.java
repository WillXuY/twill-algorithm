package org.willxu.algorithm.service.string;

public interface DefangingAnIpAddress {
    /**
     * Given a valid (IPv4) IP address, return a defanged version of
     * that IP address.
     * A defanged IP address replaces every period "." with "[.]".
     *
     * @param address the give address is a valid IPv4 address.
     * @return a defanged ("." -> "[.]") Ip address.
     */
    String defangIPaddr(String address);
}
