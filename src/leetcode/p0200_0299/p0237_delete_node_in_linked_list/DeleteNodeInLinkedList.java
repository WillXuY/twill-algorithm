/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.empty;

import common.provide.ListNode;

public interface DeleteNodeInLinkedList {
    /**
     * Write a function to delete a node in a singly-linked list. You
     * will not be given access to the head of the list, instead you
     * will be given access to the node to be deleted directly.
     *
     * It is guaranteed that the node to be deleted is not a tail node
     * in the list.
     *
     * The value of each node in the list is unique.
     * The node to be deleted is in the list and is not a tail node
     *
     * @param node 2 <= size <= 1000
     *             -1000 <= Node.val <= 1000
     */
    void deleteNode(ListNode node);
}
