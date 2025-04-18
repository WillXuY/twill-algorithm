package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.LongPressedName;

public class LongPressedNameIndex implements LongPressedName {
    /**
     * 1. Define nameIndex, typedIndex
     * 2. Get char at nameIndex, compare with typed.
     * 3. If chars at name,typed are different,
     *    check char at typedIndex and nameIndex - 1
     *    and typedIndex are same with typedIndex - 1.
     * 4. If chars are same typedIndex++.
     *
     * @param name 1 <= name.length <= 1000
     *             consist of only lowercase English letters.
     * @param typed 1 <= typed.length <= 1000
     *             consist of only lowercase English letters.
     */
    @Override
    public boolean isLongPressedName(String name, String typed) {
        char[] chars = name.toCharArray();
        int lastIndex = 0;
        char lastTyped = 0;
        for (char t: typed.toCharArray()) {
            if (t == chars[lastIndex]) {
                lastIndex++;
            } else if (lastIndex == 0) {
                return false;
            } else if (t != chars[lastIndex - 1]) {
                return false;
            } else if (t != lastTyped) {
                return false;
            }
            lastTyped = t;
            if (lastIndex >= chars.length) {
                lastIndex = chars.length - 1;
            }
        }
        // Check name has loop to last, and last char are same.
        return lastIndex == chars.length - 1 && lastTyped == chars[lastIndex];
    }
}
