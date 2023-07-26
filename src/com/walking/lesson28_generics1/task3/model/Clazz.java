package com.walking.lesson28_generics1.task3.model;

import com.walking.lesson28_generics1.task3.exception.ElementNotFoundException;

public class Clazz<T> {
    T[] array;

    public Clazz(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public T find(T element) {
        for (T el : array) {
            if (el.equals(element)) return el;
        }

        throw new ElementNotFoundException();
    }
}
