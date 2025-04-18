package leetcode.p0900_0999.p0966_vowel_spellchecker;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class VowelSpellcheckerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new String[] {"zeo", "Zuo"},
                        new String[] {"zuo"},
                        new String[] {"Zuo"}
                ),
                Arguments.arguments(
                        new String[] {
                                "KiTe","kite","hare","Hare"
                        },
                        new String[] {
                                "kite","Kite","KiTe","Hare","HARE","Hear",
                                "hear","keti","keet","keto"
                        },
                        new String[] {
                                "kite","KiTe","KiTe","Hare","hare","",
                                "","KiTe","","KiTe"
                        }
                ),
                Arguments.arguments(
                        new String[] {"yellow"},
                        new String[] {"YellOw"},
                        new String[] {"yellow"}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String[] wordList, String[] queries,
                        String[] expected) {
        VowelSpellchecker map = new VowelSpellcheckerMap();
        assertArrayEquals(expected, map.spellchecker(wordList, queries));
    }
}
