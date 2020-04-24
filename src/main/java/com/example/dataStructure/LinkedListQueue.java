package com.example.dataStructure;

import javax.annotation.Resource;

/**
 * @author fuqiang
 * @version LinkedListQueue, v0.1 2020/4/23 11:08 上午
 */
public class LinkedListQueue<E> implements Queue<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node head, tail;
    private int size;

    public LinkedListQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enqueue(E e) {
        if (tail == null) {
            tail = new Node(e);
            head = tail;
        } else {
            tail.next = new Node(e);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot dequeue from an empty queue.");
        }
        Node ret = head;
        head = head.next;
        ret.next = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return ret.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty.");
        }
        return head.e;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Queue: front ");
        Node cur = head;
        while (cur != null) {
            sb.append(cur).append("->");
            cur = cur.next;
        }
        sb.append("NULL tail");
        return sb.toString();
    }
}
