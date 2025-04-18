package org.willxu.algorithm.service.impl.string;

import org.willxu.algorithm.service.string.DefangingAnIpAddress;

public class DefangingAnIpAddressRegex implements DefangingAnIpAddress {
    @Override
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
