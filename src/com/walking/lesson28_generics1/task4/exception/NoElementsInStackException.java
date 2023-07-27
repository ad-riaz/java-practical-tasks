package com.walking.lesson28_generics1.task4.exception;

public class NoElementsInStackException extends Exception {
    public NoElementsInStackException() {
        super("There is no elements in stack!");
    }
}
