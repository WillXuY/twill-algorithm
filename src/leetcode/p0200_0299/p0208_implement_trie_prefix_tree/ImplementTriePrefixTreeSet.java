package leetcode.p0200_0299.p0208_implement_trie_prefix_tree;

import java.util.HashSet;
import java.util.Set;

public class ImplementTriePrefixTreeSet implements ImplementTriePrefixTree {
    private String key;

    private Set<ImplementTriePrefixTree> subKeySet;

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public ImplementTriePrefixTreeSet() {
        subKeySet = new HashSet<>();
    }

    @Override
    public void insert(String word) {
        if (key == null) {
            key = word;
            ImplementTriePrefixTreeSet subTree =
                    new ImplementTriePrefixTreeSet();
            subTree.setKey("");
            subKeySet.add(subTree);
            return;
        }
        String prefix = getSamePrefixString(word, key);

    }

    private String getSamePrefixString(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        for (int i = len; i > 0; i--) {
            if (word1.substring(0, i + 1).equals(word2.substring(0, i + 1))) {
                return word1.substring(0, i + 1);
            }
        }
        return "";
    }

    @Override
    public boolean search(String word) {
        return false;
    }

    @Override
    public boolean startsWith(String prefix) {
        return false;
    }
}
