package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountItemsMatchingRule;

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
