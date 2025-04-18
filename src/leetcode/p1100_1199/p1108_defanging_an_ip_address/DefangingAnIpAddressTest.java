package leetcode.p1100_1199.p1108_defanging_an_ip_address;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DefangingAnIpAddressTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1.1.1.1", "1[.]1[.]1[.]1"),
                arguments("255.100.50.0", "255[.]100[.]50[.]0")
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String address, String expected) {
        DefangingAnIpAddress regex = new DefangingAnIpAddressRegex();
        assertEquals(expected, regex.defangIPaddr(address));
    }
}
