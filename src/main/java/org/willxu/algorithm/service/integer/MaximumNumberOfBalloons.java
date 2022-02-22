package org.willxu.algorithm.service.integer;

public interface MaximumNumberOfBalloons {
    /**
     * Given a string text, you want to use the characters of text to
     * form as many instances of the word "balloon" as possible.
     * You can use each character in text at most once. Return the
     * maximum number of instances that can be formed.
     *
     * @param text 1 <= text.length <= 10^4
     *             consists of lowercase English letters only.
     * @return max number of the word balloons.
     */
    int maxNumberOfBalloons(String text);
}
