package com.datastructures.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by abhishek on 5/4/16.
 * ref: http://quiz.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 *      http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 *      java.util.LinkedList
 */
public class LinkedListIterable<T> implements Iterable<T>
{
    private Node<T> head;  // head of list

    public static class Node<T>
    {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        // this constructor is not really used
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    // this constructor is not really used
    public LinkedListIterable(Node<T> head) {
        this.head = head;
    }

    // create a new list from given data
    public LinkedListIterable(T val) {
        this.head = new Node<>(val);
    }

    // add a node at the end
    public void append(T val)
    {
        Node<T> lastNode = getLastNode();
        if (lastNode == null)
            head = new Node<>(val);
        else
            lastNode.next = new Node<>(val);
    }

    // get last node in the list
    private Node<T> getLastNode()
    {
        if (head == null)
            return null;
        Node<T> tmpNode = head;
        while (tmpNode.next != null)
        {
            tmpNode = tmpNode.next;
        }
        return tmpNode;
    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>
    {
        private Node<T> current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            if(!hasNext())
                throw new NoSuchElementException("No next value!");
            T data = current.data;
            current = current.next;
            return data;
        }
    }

    @Override
    public String toString() {
        if (head == null)
            return "The List is empty";
        StringBuilder sb = new StringBuilder(head.data.toString());
        Node tmpNode = head.next;
        while(null != tmpNode)
        {
            sb.append(", ");
            sb.append(tmpNode.data);
            tmpNode = tmpNode.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedListIterable<Integer> llist = new LinkedListIterable<>(10);
        llist.append(11);
        llist.append(13);
        llist.append(14);
        llist.insertAfter(llist.getHead().next,12);
        llist.addFront(9);
        llist.deleteKey(15);
        llist.deletePosition(8);
        llist.deleteKey(16);
        /*llist.deleteKey(10);
        llist.deletePosition(0);*/
        System.out.println(llist.toString());
        for (Integer item: llist) {
            System.out.println(item);
        }
        System.out.println("length: " + llist.getLength(2));
        System.out.println("length: " + llist.getLength(1));
        llist.swapNodes(10, 13);
        System.out.println(llist.toString());
    }

    // add node to front
    public void addFront(T val) {
        /* This would work even if head==null, so no extra handling required */
        Node<T> newHead = new Node<>(val);
        newHead.next = this.head;
        head = newHead;
    }

    // insert node after a given node
    public void insertAfter(Node<T> prevNode, T newVal) {
        if (null == prevNode)
        {
            throw new UnsupportedOperationException("The given previous node cannot be null");
        }
        Node<T> newNode = new Node<>(newVal);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // TODO: Delete when a Node object is given

    // Given a key, deletes the first occurrence of key in linked list
    // ref: http://quiz.geeksforgeeks.org/linked-list-set-3-deleting-node/
    public void deleteKey(T key) {
        /* TODO: refactor using prev node method as in GFG link above */
        if (null == head)
        {
            System.out.println("The list is empty");
            return;
        }
        if (null != head && key == head.data) {
            head = head.next;   // shift head
            return;
        }
        Node temp = head;
        while (null != temp.next && temp.next.data != key)
        {
            temp = temp.next;
        }
        if (null == temp.next) {
            System.out.println("Key " + key + " not found");
            return;
        }
        temp.next = temp.next.next;
    }

    // Given a position, deletes the node at the given position
    // ref: quiz.geeksforgeeks.org/delete-a-linked-list-node-at-a-given-position/
    public void deletePosition(int position) {
        if (null != head && 0 == position)
        {
            head = head.next;
            return;
        }
        int counter = 1;
        Node temp = head;

        // Find previous node of the node to be deleted
        while (null != temp && counter < position)
        {
            temp = temp.next;
            counter++;
        }

        // If position is more than number of nodes
        if (null != temp && null != temp.next.next)
            temp.next = temp.next.next;
        else
            System.out.println("Key at position " + position + " not found");
    }

    public Integer getLength(int option) {
        if (1 == option)
            return getLengthRecursive(this.head);
        else
            return getLengthIterative();
    }

    public Integer getLengthIterative() {
        Node<T> temp = head;
        int count = 0;
        while (null != temp) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Integer getLengthRecursive(Node<T> root) {
        if (null == root)
            return 0;
        return getLengthRecursive(root.next) + 1;
    }

    public Node<T> findNode(T key) {
        if (null == head) {
            System.out.println("List is empty!");
            return null;
        }
        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        return temp;
    }

    /* Swap nodes based on keys
     # ref: http://www.geeksforgeeks.org/swap-nodes-in-a-linked-list-without-swapping-data/ */
    public void swapNodes(T k1, T k2) {
        if (null == head) {
            System.out.println("The list is empty");
            return;
        }
        Node<T> prevk1 = null;
        Node<T> prevk2 = null;
        Node<T> currk1 = head;
        Node<T> currk2 = head;

        while (currk1.next != null && currk1.data != k1) {
            prevk1 = currk1;
            currk1 = currk1.next;
        }
        while (currk2.next != null && currk2.data != k2) {
            prevk2 = currk2;
            currk2 = currk2.next;
        }
        if (currk1 == null || currk2 == null) {
            System.out.println("Either k1 or k2 is not present in list");
            return;
        }

        if (prevk1 != null)     // If k1 is not head of linked list
            prevk1.next = currk2;
        else                    // make  k2 the new head
            head = prevk2;

        if (prevk2 != null)
            prevk2.next = currk1;
        else
            head = prevk1;

        Node<T> temp = currk1.next;
        currk1.next = currk2.next;
        currk2.next = temp;
    }

    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }
}
