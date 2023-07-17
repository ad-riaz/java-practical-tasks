package com.walking.lesson20_exceptions.task3.exception;

public class ArrayValidationException extends RuntimeException {
    public ArrayValidationException(int elementNumber) {
        super("Null element in array. Element's number: " + elementNumber);
    }
}