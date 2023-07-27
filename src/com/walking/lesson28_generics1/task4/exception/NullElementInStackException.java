package com.walking.lesson28_generics1.task4.exception;

public class NullElementInStackException extends Exception {
    public NullElementInStackException() {
        super("Null value can't be added into Stack");
    }
}
