package com.walking.lesson26_string_types.task2;

import java.util.Scanner;

/**
 * Реализуйте программу, принимающую с клавиатуры строку,
 * содержащую слова, разделенные пробелом.
 * Выведите в консоль количество уникальных слов в строке.
 * Учтите, что строка может начинаться с пробела.
 * <p>
 * Для упрощения допустим, что в строке не могут использоваться символы,
 * отличные от пробела или русских/английский букв.
 * Помните, что слово может быть введено в разных регистрах.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вашу строку: ");
        String[] words = scanner.nextLine()
                                .trim()
                                .toLowerCase()
                                .split(" ");
        scanner.close();
        int counter = 0;

        for (int i = 0; i < words.length; i++) {

            boolean isUnique = true;
            int j = 0;

            while (j < i && isUnique) {
                if (words[i].equals(words[j])) {
                    isUnique = false;
                } else {
                    j++;
                }
            }

            if (isUnique) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
