package com.walking.lesson19_object_methods.Task1;
import com.walking.lesson19_object_methods.Task1.model.Car;

import java.util.Scanner;

/**
 * Реализуйте класс «Машина». Поля допустимо выбрать на свое усмотрение, но необходимо,
 * чтобы по ним можно было однозначно идентифицировать каждую машину.
 * Скажем, в рамках базы ГАИ.
 * <p>
 * Создайте массив машин. Реализуйте максимально эффективную проверку на вхождение машины в ваш массив.
 * Данные для проверки необходимо запрашивать с клавиатуры.
 * <p>
 * Если машина найдена — выведите ее строковое представление в консоль.
 * <p>
 * Опциональное усложнение: номер машины может быть не уникальным.
 */
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Honda Accord", "grey", "A456XA77", "JH4DA1745GS002661"),
            new Car("Toyota Land Cruiser", "blue", "A001AA77", "2CNBJ134146900067"),
            new Car("Toyota Land Cruiser", "blue", "A001AA77", "2CVBJ134146900067"),
            new Car("Mitsubishi ASX", "white", "C720XA36", "1C4BJWKGXDL508578"),
            new Car("VAZ 2104", "purple", "X045HA36", "4JGBF71E18A429191")
        };

        Scanner scanner = new Scanner(System.in);
        String model = "";
        String color = "";
        String number = "";
        String vin = "";

        while (model.isEmpty()) {
            System.out.println("Введите модель автомобиля: ");
            model = scanner.nextLine();
        }

        while (color.isEmpty()) {
            System.out.println("Введите цвет автомобиля: ");
            color = scanner.nextLine();
        }

        while (number.isEmpty()) {
            System.out.println("Введите гос.номер автомобиля: ");
            number = scanner.nextLine();
        }

        while(vin.isEmpty()) {
            System.out.println("Введите VIN автомобиля: ");
            vin = scanner.nextLine();
        }

        Car searchingCar = new Car(model, color, number, vin);

        for (Car car : cars) {
            if (car.equals(searchingCar)) System.out.println("Машина найдена!\n" + searchingCar);
        }
    }
}
