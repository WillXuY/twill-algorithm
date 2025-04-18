package leetcode.p0200_0299.p0208_implement_trie_prefix_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImplementTriePrefixTreeTest {
    @Test
    public void testSet() {
        ImplementTriePrefixTree set = new ImplementTriePrefixTreeSet();
        set.insert("apple");
        assertTrue(set.search("apple"));
        assertFalse(set.search("app"));
        assertTrue(set.startsWith("app"));
        set.insert("app");
        assertTrue(set.search("app"));
    }
}
