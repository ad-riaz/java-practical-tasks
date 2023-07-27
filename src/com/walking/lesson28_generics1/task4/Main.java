package com.walking.lesson28_generics1.task4;

import com.walking.lesson28_generics1.task4.exception.NoSuchElementInStackException;
import com.walking.lesson28_generics1.task4.model.Stack;

/**
 * Реализовать параметризованный класс, хранящий и обрабатывающий стек.
 * Стек — структура данных, в котором каждый элемент хранит ссылку на следующий.
 * Работает по принципу LIFO (последний вошел — первый вышел).
 * <p>
 * Реализовать следующие методы:
 * <p>
 * Добавление элемента в стек;
 * Удаление элемента из стека. При удалении несуществующего элемента – исключение;
 * Получение глубины (количества элементов) стека;
 * Поиск по стеку, при отсутствии искомого значения – исключение;
 * Получение строкового эквивалента элементов стека, представленных в виде массива
 * ([строковое представление элемента1, ..., строковое представление элементаN]).
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(String.class);

        System.out.println("Size: " + stack.size());
        System.out.println("Length: " + stack.length());

        stack.push("One");
        stack.push("Two");
        stack.push(null);
        stack.push("Four");
        stack.push("Five");
        stack.push("Six");
        stack.push("Seven");
        stack.push("Eight");
        stack.push("Nine");
        stack.push("Ten");
        stack.push("Eleven");
        stack.push("Twelve");
        System.out.println(stack.toString());
        System.out.println("Size: " + stack.size());
        System.out.println("Length: " + stack.length());


        System.out.println("Popped from stack: " + stack.pop());
        System.out.println(stack.toString());
        System.out.println("Size: " + stack.size());
        System.out.println("Length: " + stack.length());


        System.out.println("Found element: " + stack.find("Nine"));
        System.out.println("Found element: " + stack.find("Three"));
    }
}
