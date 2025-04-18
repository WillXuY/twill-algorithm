package org.willxu.algorithm.service.bool;

public interface LongPressedName {
    /**
     * Your friend is typing his name into a keyboard. Sometimes, when
     * typing a character c, the key might get long pressed, and the
     * character will be typed 1 or more times.
     * You examine the typed characters of the keyboard. Return True if
     * it is possible that it was your friends name, with some
     * characters (possibly none) being long pressed.
     *
     * @param name 1 <= name.length <= 1000
     *             consist of only lowercase English letters.
     * @param typed 1 <= typed.length <= 1000
     *             consist of only lowercase English letters.
     * @return is typed a long pressed name.
     */
    boolean isLongPressedName(String name, String typed);
}
