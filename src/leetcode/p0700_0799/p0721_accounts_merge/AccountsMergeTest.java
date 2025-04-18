package leetcode.p0700_0799.p0721_accounts_merge;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountsMergeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        Stream.of(
                                Stream.of(
                                        "Hanzo","Hanzo2@m.co","Hanzo3@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo4@m.co","Hanzo5@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo0@m.co","Hanzo1@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo3@m.co","Hanzo4@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo7@m.co","Hanzo8@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo1@m.co","Hanzo2@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo6@m.co","Hanzo7@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo5@m.co","Hanzo6@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        Stream.of(
                                Stream.of(
                                        "Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo2@m.co",
                                        "Hanzo3@m.co","Hanzo4@m.co","Hanzo5@m.co","Hanzo6@m.co",
                                        "Hanzo7@m.co","Hanzo8@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        Stream.of(
                                Stream.of(
                                        "David","David0@m.co","David1@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "David","David3@m.co","David4@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "David","David4@m.co","David5@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "David","David2@m.co","David3@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "David","David1@m.co","David2@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        Stream.of(
                                Stream.of(
                                        "David","David0@m.co","David1@m.co",
                                        "David2@m.co","David3@m.co","David4@m.co","David5@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        Stream.of(
                                Stream.of(
                                        "John","johnsmith@mail.com",
                                        "john_newyork@mail.com"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "John","johnsmith@mail.com",
                                        "john00@mail.com"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Mary","mary@mail.com"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "John","johnnybravo@mail.com"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        Stream.of(
                                Stream.of(
                                        "John","john00@mail.com",
                                        "john_newyork@mail.com",
                                        "johnsmith@mail.com"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Mary","mary@mail.com"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "John","johnnybravo@mail.com"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        Stream.of(
                                Stream.of(
                                        "Gabe","Gabe0@m.co",
                                        "Gabe3@m.co","Gabe1@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Kevin","Kevin3@m.co",
                                        "Kevin5@m.co","Kevin0@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Ethan","Ethan5@m.co",
                                        "Ethan4@m.co","Ethan0@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo3@m.co",
                                        "Hanzo1@m.co","Hanzo0@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Fern","Fern5@m.co",
                                        "Fern1@m.co","Fern0@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList()),
                        Stream.of(
                                Stream.of(
                                        "Ethan","Ethan0@m.co",
                                        "Ethan4@m.co","Ethan5@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Gabe","Gabe0@m.co",
                                        "Gabe1@m.co","Gabe3@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Hanzo","Hanzo0@m.co",
                                        "Hanzo1@m.co","Hanzo3@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Kevin","Kevin0@m.co",
                                        "Kevin3@m.co","Kevin5@m.co"
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        "Fern","Fern0@m.co",
                                        "Fern1@m.co","Fern5@m.co"
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(List<List<String>> accounts,
                        List<List<String>> expected) {
        AccountsMerge set = new AccountsMergeSet();
        assertEquals(expected, set.accountsMerge(accounts));
    }
}
