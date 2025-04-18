package leetcode.p0600_0699.p0609_find_duplicate_file_in_system;

import java.util.List;

public interface FindDuplicateFileInSystem {
    /**
     * Given a list paths of directory info, including the directory
     * path, and all the files with contents in this directory, return
     * all the duplicate files in the file system in terms of their
     * paths. You may return the answer in any order.
     * <p>
     * A group of duplicate files consists of at least two files that
     * have the same content.
     * <p>
     * A single directory info string in the input list has the
     * following format:
     * <p>
     * - "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
     * <p>
     * It means there are n files (f1.txt, f2.txt ... fn.txt) with
     * content (f1_content, f2_content ... fn_content) respectively in
     * the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0.
     * If m = 0, it means the directory is just the root directory.
     * <p>
     * The output is a list of groups of duplicate file paths. For each
     * group, it contains all the file paths of the files that have the
     * same content. A file path is a string that has the following
     * format:
     * <p>
     * - "directory_path/file_name.txt"
     * <p>
     * You may assume no files or directories share the same name in the
     * same directory.
     * <p>
     * You may assume each given directory info represents a unique
     * directory. A single blank space separates the directory path and
     * file info.
     *
     * @param paths 1 <= paths.length <= 2 * 10^4
     *              1 <= paths[i].length <= 3000
     *              1 <= sum(paths[i].length) <= 5 * 10^5
     *              paths[i] consist of English letters, digits,
     *              '/', '.', '(', ')', and ' '.
     */
    List<List<String>> findDuplicate(String[] paths);
}
