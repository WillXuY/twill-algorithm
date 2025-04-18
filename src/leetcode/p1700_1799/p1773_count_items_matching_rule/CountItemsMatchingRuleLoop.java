package leetcode.p1700_1799.p1773_count_items_matching_rule;

import java.util.List;

public class CountItemsMatchingRuleLoop implements CountItemsMatchingRule {
    @Override
    public int countMatches(List<List<String>> items, String ruleKey,
                            String ruleValue) {
        int index = 0;
        switch (ruleKey) {
            case "color" -> index = 1;
            case "name" -> index = 2;
        }
        int output = 0;
        for (List<String> i: items) {
            if (ruleValue.equals(i.get(index))) {
                output++;
            }
        }
        return output;
    }
}
