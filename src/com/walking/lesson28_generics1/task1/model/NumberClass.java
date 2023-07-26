package com.walking.lesson28_generics1.task1.model;

public class NumberClass<T extends Number> {
    private T number;

    public NumberClass(T ob) {
        number = ob;
    }

    public T getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberClass<?> that = (NumberClass<?>) o;

        return getNumber().equals(that.getNumber());
    }

    @Override
    public int hashCode() {
        return getNumber().hashCode();
    }

    public double power(int exponent) {
        return Math.pow(number.doubleValue(), exponent);
    }
}
