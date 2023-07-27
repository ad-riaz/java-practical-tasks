package com.walking.lesson28_generics1.task4.exception;

public class NoSuchElementInStackException extends RuntimeException {
    public NoSuchElementInStackException(String message) {
        super(message);
    }

    public NoSuchElementInStackException() {
        super("There is no such element in Stack");
    }
}
