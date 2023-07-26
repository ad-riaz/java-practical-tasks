package com.walking.lesson28_generics1.task2.model;

public class Clazz<T>{
    private T obj;

    public Clazz(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public boolean isNull() {
        return obj == null;
    }
}
