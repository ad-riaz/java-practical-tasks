package com.walking.lesson28_generics1.task2;

import com.walking.lesson28_generics1.task2.model.Clazz;

/**
 * Создать класс-обертку над объектом любого типа.
 * Предусмотреть boolean-метод, проверяющий значение объекта на null.
 */
public class Main {
    public static void main(String[] args) {
        Clazz<Object> notNullObject = new Clazz<>(new Object());
        System.out.println(notNullObject.isNull());

        Clazz<Object> nullObject = new Clazz<>(null);
        System.out.println(nullObject.isNull());
    }
}
