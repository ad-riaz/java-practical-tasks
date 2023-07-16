package com.walking.lesson20_exceptions.task1_catchException.model;

import com.walking.lesson20_exceptions.task1_catchException.enums.InformationType;

public class File {
    private String filename;
    private double size;
    private InformationType type;

    public File(String filename, double size, InformationType type) {
        this.filename = filename;
        this.size = size;
        this.type = type;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public InformationType getType() {
        return type;
    }

    public void setType(InformationType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "File{" +
                "filename='" + filename + '\'' +
                ", size=" + size +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        File file = (File) o;

        if (Double.compare(file.getSize(), getSize()) != 0) return false;
        if (!getFilename().equals(file.getFilename())) return false;
        return getType() == file.getType();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getFilename().hashCode();
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getType().hashCode();
        return result;
    }
}
