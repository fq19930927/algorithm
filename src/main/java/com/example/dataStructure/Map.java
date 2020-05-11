package com.example.dataStructure;

/**
 * @author fuqiang
 * @version Map, v0.1 2020/5/11 5:17 下午
 */
public interface Map<K, V> {

    void add(K key, V value);

    V remove(K key);

    boolean contains(K key);

    V get(K key);

    void set(K key, V newValue);

    int getSize();

    boolean isEmpty();
}
