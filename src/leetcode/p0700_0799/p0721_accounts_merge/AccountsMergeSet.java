package org.willxu.algorithm.service.impl.strlist;

import org.willxu.algorithm.service.strlist.AccountsMerge;

import java.util.*;

public class AccountsMergeSet implements AccountsMerge {
    @Override
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, List<Set<String>>> nameMailSetListMap = new HashMap<>();
        for (List<String> a: accounts) {
            String name = a.get(0);
            a.remove(0);
            if (!nameMailSetListMap.containsKey(name)) {
                List<Set<String>> mailSetList = new ArrayList<>();
                mailSetList.add(new TreeSet<>(a));
                nameMailSetListMap.put(name, mailSetList);
                continue;
            }
            List<Set<String>> mailSetList = nameMailSetListMap.get(name);
            boolean added = false;
            for (String m: a) {
                for (Set<String> exist: mailSetList) {
                    if (exist.contains(m)) {
                        exist.addAll(a);
                        added = true;
                        break;
                    }
                }
                if (added) {
                    break;
                }
            }
            if (!added) {
                mailSetList.add(new TreeSet<>(a));
            }
        }
        // merge nameMailSetListMap
        for (String name: nameMailSetListMap.keySet()) {
            List<Set<String>> value = nameMailSetListMap.get(name);
            List<Set<String>> merged = new ArrayList<>();
            while (merged.size() != value.size()) {
                if (!merged.isEmpty()) {
                    value = merged;
                    merged = new ArrayList<>();
                }
                boolean added = false;
                for (int i = 0; i < value.size(); i++) {
                    Set<String> v = value.get(i);
                    int mergedIndex = -1;
                    for (String s: v) {
                        for (int j = i + 1; j < value.size(); j++) {
                            Set<String> other = value.get(j);
                            if (other.contains(s)) {
                                v.addAll(other);
                                merged.add(v);
                                added = true;
                                mergedIndex = j;
                                break;
                            }
                        }
                        if (added) {
                            break;
                        }
                    }
                    if (added) {
                        for (int k = i + 1; k < value.size(); k++) {
                            if (k == mergedIndex) {
                                continue;
                            }
                            merged.add(value.get(k));
                        }
                        break;
                    } else {
                        merged.add(v);
                    }
                }
            }
            nameMailSetListMap.put(name, merged);
        }
        List<List<String>> result = new ArrayList<>();
        for (String key: nameMailSetListMap.keySet()) {
            List<Set<String>> value = nameMailSetListMap.get(key);
            for (Set<String> s: value) {
                List<String> r = new ArrayList<>();
                r.add(key);
                r.addAll(s);
                result.add(r);
            }
        }
        return result;
    }
}
