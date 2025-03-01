package org.willxu.algorithm.service.integer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindWordsThatCanBeFormedByCharactersMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindWordsThatCanBeFormedByCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. List.contains only compare elements not the count.
                arguments(
                        new String[] {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin",
                                "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb",
                                "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl",
                                "boygirdlggnh",
                                "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx",
                                "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop",
                                "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx",
                                "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr",
                                "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo",
                                "oxgaskztzroxuntiwlfyufddl",
                                "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp",
                                "qnagrpfzlyrouolqquytwnwnsqnmuzphne",
                                "eeilfdaookieawrrbvtnqfzcricvhpiv",
                                "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz",
                                "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue",
                                "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv",
                                "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo",
                                "teyygdmmyadppuopvqdodaczob",
                                "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs",
                                "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"
                        },
                        "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp",
                        0

                ),
                arguments(
                        // cat + hat
                        new String[] {"cat", "bt", "hat", "tree"},
                        "atach", 6
                ),
                arguments(
                        // hello + world
                        new String[] {"hello", "world", "leetcode"},
                        "welldonehoneyr", 10
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String[] words, String chars, int expected) {
        FindWordsThatCanBeFormedByCharacters map =
                new FindWordsThatCanBeFormedByCharactersMap();
        assertEquals(expected, map.countCharacters(words, chars));
    }

    /**
     * List {a} containsAll list {a,a}
     */
    @Test
    public void testContains() {
        List<Character> singleList = "a".chars().mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        List<Character> doubleList = "aa".chars().mapToObj(c -> (char) c)
                .collect(Collectors.toList());
        assertTrue(singleList.containsAll(doubleList));
        System.out.println(singleList.retainAll(doubleList));
        System.out.println(singleList);
    }
}
