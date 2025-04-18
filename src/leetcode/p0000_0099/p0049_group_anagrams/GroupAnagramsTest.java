package leetcode.p0000_0099.p0049_group_anagrams;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GroupAnagramsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"eat", "tea", "tan", "ate", "nat", "bat"},
                        Stream.of(
                                Stream.of(
                                        "bat"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "nat", "tan"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "ate", "eat", "tea"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new String[] {""},
                        Stream.of(
                                Stream.of("").collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new String[] {"a"},
                        Stream.of(
                                Stream.of("a").collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Hash {index}")
    @MethodSource("dataProvider")
    public void testHash(String[] strs, List<List<String>> expected)
            throws JsonProcessingException {
        GroupAnagrams hash = new GroupAnagramsHash();
        ObjectMapper objectMapper = new ObjectMapper();
        String output = objectMapper.writeValueAsString(
                hash.groupAnagrams(strs));
        assertEquals(objectMapper.writeValueAsString(expected), output);
    }
}
