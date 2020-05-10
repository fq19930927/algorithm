package com.example.dataStructure;

/**
 * @author fuqiang
 * @version LinkedListSet, v0.1 2020/5/9 2:57 下午
 */
public class LinkedListSet<E> implements Set<E> {

    private LinkedList<E> list;

    @Override
    public void add(E e) {
        if (!contains(e)) {
            list.addFirst(e);
        }
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
