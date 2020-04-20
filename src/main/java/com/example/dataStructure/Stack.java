package com.example.dataStructure;

/**
 * @author fuqiang
 * @version Stack, v0.1 2020/4/20 11:09 上午
 */
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);

    /**
     * 出栈
     *
     * @return
     */
    E pop();

    /**
     * 查看栈顶元素
     *
     * @return
     */
    E peek();
}
