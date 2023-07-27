package com.walking.lesson28_generics1.task4.model;

import com.walking.lesson28_generics1.task4.exception.NoElementsInStackException;
import com.walking.lesson28_generics1.task4.exception.NoSuchElementInStackException;
import com.walking.lesson28_generics1.task4.exception.NullElementInStackException;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class Stack<E> {
    private E[] elements;

    private static final int DEFAULT_STACK_SIZE = 10;

    public Stack(Class<E> clazz) {
        this(clazz, DEFAULT_STACK_SIZE);
    }

    public Stack(Class<E> clazz, int capacity) {
        elements = (E[]) Array.newInstance(clazz, capacity);
    }


//  Добавление элемента в стек
    public void push(E element) {
        if (element == null) {
            try {
                throw new NullElementInStackException();
            } catch (NullElementInStackException e) {
                System.out.println(e.getMessage());
            }
        }

        int size = size();

        if (size == length()) {
            elements = increaseSize();
        }

        elements[size] = element;
    }

//  Удаление элемента из стека. При удалении несуществующего элемента - выбросить исключение
    public E pop() {
        if (size() == 0) {
            try {
                throw new NoElementsInStackException();
            } catch (NoElementsInStackException e) {
                System.out.println(e.getMessage());
            }
        }
        E element = elements[size() - 1];
        elements[size() - 1] = null;
        return element;
    }

//  Получение глубины стека (количества элементов)
    public int size() {
        int counter = 0;
        for (int i = 0; i < elements.length; i++) {
            if (!Objects.equals(elements[i], null)) counter++;
        }
        return counter;
    }

//  Поиск по стеку, при отсутствии искомого значения – исключение;
    public E find(E element) throws NoSuchElementInStackException {
        for (int i = 0; i < size(); i++) {
            if (Objects.equals(elements[i], element)) {
                return elements[i];
            }
        }

        throw new NoSuchElementInStackException("There is no " + element + " element in Stack");
    }

//  Получение строкового эквивалента элементов стека, представленных в виде массива
    public String toString() {
        StringBuilder representation = new StringBuilder("[\n");
        for (E element : elements) {
            representation.append(element).append(",\n");
        }
        representation.append("]\n");
        return representation.toString();
    }

    private E[] increaseSize() {
        return Arrays.copyOf(elements, length() * 2);
    }

    public int length() {
        return elements.length;
    }
}
