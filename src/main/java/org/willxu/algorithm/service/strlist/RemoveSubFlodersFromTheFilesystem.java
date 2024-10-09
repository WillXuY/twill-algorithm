package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface RemoveSubFlodersFromTheFilesystem {
    /**
     * Given a list of folders folder, return the folders after removing
     * all sub-folders in those folders. You may return the answer in
     * any order.
     * <p>
     * If a folder[i] is located within another folder[j], it is called
     * a sub-folder of it.
     * <p>
     * The format of a path is one or more concatenated strings of the
     * form: '/' followed by one or more lowercase English letters.
     * <p>
     * - For example, "/leetcode" and "/leetcode/problems" are valid paths
     *   while an empty string and "/" are not.
     *
     * @param folder 1 <= folder.length <= 4 * 10^4
     *               2 <= folder[i].length <= 100
     *               folder[i] contains only lowercase letters and '/'.
     *               folder[i] always starts with the character '/'.
     *               Each folder name is unique.
     */
    List<String> removeSubfolders(String[] folder);
}
