package com.walking.lesson28_generics1.task3;
import com.walking.lesson28_generics1.task3.model.Clazz;

/**
 * Реализовать класс для работы с массивом.
 * Разработать метод, производящий поиск значения в массиве.
 * Если значение не найдено — выбрасывать исключение.
 * Если найдено — возвращать его.
 */
public class Main {
    public static void main(String[] args) {
        String[] stringArray = {"one", "two", "three", "four", "five"};
        Clazz<String> clazz = new Clazz<>(stringArray);

        System.out.println(clazz.find("five"));
        System.out.println(clazz.find("six"));
    }
}
