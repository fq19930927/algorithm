package com.example.dataStructure;

/**
 * @author fuqiang
 * @version Queue, v0.1 2020/4/21 10:21 上午
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
