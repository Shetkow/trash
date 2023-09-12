package org.example.collections.set;

import org.example.collections.CarCollection;

public interface CarSet<T> extends CarCollection<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();
}