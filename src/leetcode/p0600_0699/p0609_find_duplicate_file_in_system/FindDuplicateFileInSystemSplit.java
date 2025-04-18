package leetcode.p0600_0699.p0609_find_duplicate_file_in_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystemSplit
        implements FindDuplicateFileInSystem {
    @Override
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> valuePathListMap = new HashMap<>();
        for (String p: paths) {
            String[] pathFiles = p.split(" ");
            String path = pathFiles[0];
            for (int i = 1; i < pathFiles.length; i++) {
                String[] fileValue = pathFiles[i].split("\\(");
                String file = fileValue[0];
                String pathFile = path + "/" + file;
                String value = fileValue[1].substring(0,
                        fileValue[1].length() - 1);
                if (valuePathListMap.containsKey(value)) {
                    valuePathListMap.get(value).add(pathFile);
                } else {
                    List<String> pathList = new ArrayList<>();
                    pathList.add(pathFile);
                    valuePathListMap.put(value, pathList);
                }
            }
        }
        return valuePathListMap.values().stream().filter(
                l -> l.size() > 1
        ).toList();
    }
}
