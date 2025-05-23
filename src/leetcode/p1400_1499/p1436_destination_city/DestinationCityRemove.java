package leetcode.p1400_1499.p1436_destination_city;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCityRemove implements DestinationCity {
    @Override
    public String destCity(List<List<String>> paths) {
        Set<String> startSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        for (List<String> path: paths) {
            startSet.add(path.get(0));
            endSet.add(path.get(1));
        }
        endSet.removeAll(startSet);
        for (String output: endSet) {
            return output;
        }
        return null;
    }
}
