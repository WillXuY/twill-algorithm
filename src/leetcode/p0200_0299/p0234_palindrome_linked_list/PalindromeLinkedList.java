/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import common.provide.ListNode;

public interface PalindromeLinkedList {
    /**
     * Given the head of a singly linked list, return true if it is a
     * palindrome.
     *
     * Follow up:
     * Could you do it in O(n) time and O(1) space?
     *
     * @param head 1 <= size <= 10^5
     *             0 <= Node.val < 9
     * @return is palindrome or not.
     */
    boolean isPalindrome(ListNode head);
}
