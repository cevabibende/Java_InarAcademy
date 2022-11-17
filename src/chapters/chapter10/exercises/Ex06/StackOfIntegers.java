package chapters.chapter10.exercises.Ex06;


import java.util.SplittableRandom;

public class StackOfIntegers {
    private int[] elements;
    private int size;
    private int capacity;

    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public boolean empty() {
        return (size == 0);
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int peek() {
        return elements[size - 1];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        size--;
        return elements[size];
    }

    public int getSize() {
        return this.size;
    }
}
