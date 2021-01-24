package com.geeksforgeeks.linkedlists;

import com.datastructures.linkedlist.LinkedListIterable;

/**
 * Created by abhishek on 7/9/16.
 */
public class Insertion {

    // add node to front of linked list
    public void pushToFront(LinkedListIterable.Node head, int val) {
        LinkedListIterable.Node newHead = new LinkedListIterable.Node(val);
    }

    public static void main(String[] args) {
        LinkedListIterable<Integer> ll = new LinkedListIterable<>(10);
        LinkedListIterable.Node first = ll.getHead();
    }
}
