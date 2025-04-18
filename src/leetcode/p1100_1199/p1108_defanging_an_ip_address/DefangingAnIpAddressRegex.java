package leetcode.p1100_1199.p1108_defanging_an_ip_address;

public class DefangingAnIpAddressRegex implements DefangingAnIpAddress {
    @Override
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
