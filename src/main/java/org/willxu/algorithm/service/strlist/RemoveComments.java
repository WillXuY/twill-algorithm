package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface RemoveComments {
    /**
     * Given a C++ program, remove comments from it. The program source
     * is an array of strings source where source[i] is the i^th line of
     * the source code. This represents the result of splitting the
     * original source code string by the newline character '\n'.
     * <p>
     * In C++, there are two types of comments, line comments, and block
     * comments.
     * <p>
     * - The string "//" denotes a line comment, which represents that
     *   it and the rest of the characters to the right of it in the
     *   same line should be ignored.
     * - The string "/*" denotes a block comment, which represents that
     *   all characters until the next (non-overlapping) occurrence of
     *   "*\/" should be ignored. (Here, occurrences happen in reading
     *   order: line by line from left to right.) To be clear, the
     *   string "/*\/" does not yet end the block comment, as the ending
     *   would be overlapping the beginning.
     * <p>
     * The first effective comment takes precedence over others.
     * <p>
     * - For example, if the string "//" occurs in a block comment, it
     *   is ignored.
     * - Similarly, if the string "/*" occurs in a line or block comment,
     *   it is also ignored.
     * <p>
     * If a certain line of code is empty after removing comments, you
     * must not output that line: each string in the answer list will be
     * non-empty.
     * <p>
     * There will be no control characters, single quote, or double
     * quote characters.
     * <p>
     * - For example, source = "string s = "/* Not a comment. *\/";"
     *   will not be a test case.
     * <p>
     * Also, nothing else such as defines or macros will interfere with
     * the comments.
     * <p>
     * It is guaranteed that every open block comment will eventually be
     * closed, so "/*" outside of a line or block comment always starts
     * a new comment.
     * <p>
     * Finally, implicit newline characters can be deleted by block
     * comments. Please see the examples below for details.
     * <p>
     * After removing the comments from the source code, return the
     * source code in the same format.
     *
     * @param source
     * @return
     */
    List<String> removeComments(String[] source);
}
