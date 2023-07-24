package com.walking.lesson26_string_types.task1;

import java.util.Scanner;

/**
 * Реализуйте задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson6_methods/Task3.java">...</a>
 * используя StringBuilder или StringBuffer. Объясните свой выбор.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = enterDimension(scanner, "Enter rectangle width: ");
        int height = enterDimension(scanner, "Enter rectangle height: ");
        scanner.close();

        draw(width, height);
    }

    public static int enterDimension(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static void draw(int width, int height) {
        System.out.println(
                new StringBuilder("")
                .append(getHorizontalSequence(width))
                .append(getVerticalSequence(width, height))
                .append(getHorizontalSequence(width)).toString()
        );
    }

    private static StringBuilder getHorizontalSequence(int width) {
        return getHorizontalLine(width);
    }

    private static StringBuilder getVerticalSequence(int width, int height) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < height; i++) {
            sb.append(getVerticalLine(width));
        }
        return sb;
    }

    private static StringBuilder getHorizontalLine(int width) {
        StringBuilder sb = new StringBuilder("");

        sb.append(" ");

        for (int i = 0; i < width; i++) {
            sb.append("-");
        }

        sb.append(" \n");
        return sb;
    }

    private static StringBuilder getVerticalLine(int width) {
        StringBuilder sb = new StringBuilder("");
        sb.append("|");

        for (int i = 0; i < width; i++) {
            sb.append(" ");
        }

        sb.append("|\n");
        return sb;
    }
}
