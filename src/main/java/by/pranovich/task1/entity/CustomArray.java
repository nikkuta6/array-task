package by.pranovich.task1.entity;

import by.pranovich.task1.exception.CustomArrayException;


import java.util.Arrays;

public class CustomArray implements Cloneable {

    private long id;
    private int[] array;

    public CustomArray(long id, int[] array) throws CustomArrayException {
        if (id <= 0) {
            throw new CustomArrayException("Id can't be less or equals to 0!");
        }
        if (array == null || array.length == 0) {
            throw new CustomArrayException("Array can't be null or empty!");
        }
        this.id = id;
        this.array = array.clone();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) throws CustomArrayException {
        if (id <= 0) {
            throw new CustomArrayException("Id can't be less or equals to 0!");
        }
        this.id = id;
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int[] array) throws CustomArrayException {
        if (array == null || array.length == 0) {
            throw new CustomArrayException("Array can't be null or empty!");
        }
        this.array = array.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomArray other = (CustomArray) o;

        return (id == other.id && Arrays.equals(this.array, other.array));
    }

    @Override
    public int hashCode() {
        int result = Long.hashCode(id);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomArray {\nid = ");
        sb.append(id).append("\n").append(Arrays.toString(array)).append("\n}");

        return sb.toString();
    }

    @Override
    public CustomArray clone() throws CloneNotSupportedException {
        CustomArray copy = (CustomArray) super.clone();
        copy.id = this.id;
        copy.array = this.array.clone();

        return copy;
    }
}
