package org.willxu.algorithm.service.string;

public interface SimplifyPath {
    /**
     * Given a string path, which is an absolute path (starting with a
     * slash '/') to a file or directory in a Unix-style file system,
     * convert it to the simplified canonical path.
     * <p>
     * In a Unix-style file system, a period '.' refers to the current
     * directory, a double period '..' refers to the directory up a
     * level, and any multiple consecutive slashes (i.e. '//') are
     * treated as a single slash '/'. For this problem, any other format
     * of periods such as '...' are treated as file/directory names.
     * <p>
     * The canonical path should have the following format:
     * <p>
     * - The path starts with a single slash '/'.
     * - Any two directories are separated by a single slash '/'.
     * - The path does not end with a trailing '/'.
     * - The path only contains the directories on the path from the
     *   root directory to the target file or directory (i.e., no period
     *   '.' or double period '..')
     * <p>
     * Return the simplified canonical path.
     *
     * @param path 1 <= path.length <= 3000
     *             consists of English letters, digits, period '.',
     *             slash '/' or '_'.
     *             is a valid absolute Unix path.
     */
    String simplifyPath(String path);
}
