package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {

    private T[] data;
    private static int DEFAULT_SIZE = 1;
    private int size = 0; // it is not the actual size but the no of elements present in the array.

    public CustomArrayList() {
        this.data = (T[]) new Object[DEFAULT_SIZE];
    }

    public void add(T value) {
        if (isFull()) {
            resize();
        }
        data[size++] = value;
    }

    private void resize() {
        T[] temp = (T[]) new Object[data.length * 2];

        // copy the elements of the data array to an temp array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;

    }

    private boolean isFull() {
        return size == data.length;
    }

    private void display(T[] data) {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        System.out.println(Arrays.toString(temp));

    }

    public void removeat(int index) {
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }

    public void remove() {
        removeat(size - 1);
    }

    public void get(int index) {
        System.out.println(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);

    }

    public void print() {
        display(data);
    }

    public void checkType(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        T element = data[index];
        System.out.println("Type of element at index " + index + ": " + element.getClass().getName());
    }

    public static void main(String[] args) {

        CustomArrayList<String> list = new CustomArrayList<>();
        list.add("Harrish");
        list.add("string1");
        list.add("string2");
        list.add("string2");
        list.print();
        list.checkType(0);
    }
}
