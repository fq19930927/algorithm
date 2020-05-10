package com.example.dataStructure;

/**
 * @author fuqiang
 * @version Set, v0.1 2020/5/9 2:34 下午
 */
public interface Set<E> {

    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}
