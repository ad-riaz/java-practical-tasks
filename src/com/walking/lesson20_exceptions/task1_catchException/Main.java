package com.walking.lesson20_exceptions.task1_catchException;

import com.walking.lesson20_exceptions.task1_catchException.model.File;
import com.walking.lesson20_exceptions.task1_catchException.service.FileGenerator;
import com.walking.lesson20_exceptions.task1_catchException.service.SearchService;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
 * <p>
 * Реализуйте класс «Файл» содержит название файла, его размер и тип информации
 * (Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).
 * <p>
 * Реализуйте механизм поиска по файлам.
 * Метод, реализующий поиск должен выбрасывать FileNotFoundException, если файл не найден.
 * Если файл с названием, введенным пользователем с клавиатуры,
 * существует – вывести на экран информацию о нем
 * (допустимо использовать переопределенный toString()).
 * Если нет, то выведите сообщение «Искомый файл не существует».
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        SearchService searchService = new SearchService(FileGenerator.generate());
        searchService.search(getFileName());
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in);

        String filename = "";

        while(filename.isEmpty()) {
            System.out.println("Введите имя файла: ");
            filename = scanner.nextLine();
        }

        return filename;
    }
}
