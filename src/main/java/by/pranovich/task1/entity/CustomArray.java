package by.pranovich.task1.entity;

import by.pranovich.task1.exception.CustomArrayException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


import java.util.Arrays;

public class CustomArray implements Cloneable {

    private long id;
    private int[] array;

    private CustomArray() {
    }

    public long getId() {
        return id;
    }

    public int[] getArray() {
        return array.clone();
    }

    @Contract(" -> new")
    public static @NotNull Builder newBuilder() {
        return new CustomArray().new Builder();
    }

    public class Builder {

        private Builder() {
        }

        public Builder setId(long id) throws CustomArrayException {
            if (id <= 0) {
                throw new CustomArrayException("Id can't be less or equals to 0!");
            }
            CustomArray.this.id = id;
            return this;
        }

        public Builder setArray(int[] arr) throws CustomArrayException {
            if (arr == null || arr.length == 0) {
                throw new CustomArrayException("Incorrect data: array can't be empty or null!");
            }

            CustomArray.this.array = arr.clone();
            return this;
        }

        public CustomArray build() throws CustomArrayException {
            if (CustomArray.this.array == null || CustomArray.this.array.length == 0) {
                throw new CustomArrayException("Incorrect data: array can't be empty or null!");
            }

            return CustomArray.this;
        }
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

        return id == other.id && Arrays.equals(this.array, other.array);
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
