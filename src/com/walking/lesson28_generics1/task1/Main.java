package com.walking.lesson28_generics1.task1;

import com.walking.lesson28_generics1.task1.model.NumberClass;

/**
 * Создать обобщенный тип, принимающий в себя любого из наследников Number.
 * Создать метод, возводящий значение параметризованного типа в степень,
 * переданную параметром в метод.
 */
public class Main {
    public static void main(String[] args) {
        NumberClass<Integer> numInt = new NumberClass<>(10);
        NumberClass<Double> numDouble = new NumberClass<>(100.0);

        System.out.println(numInt.power(3));
        System.out.println(numDouble.power(3));
    }
}
