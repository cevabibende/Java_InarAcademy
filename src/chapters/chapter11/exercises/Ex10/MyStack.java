package chapters.chapter11.exercises.Ex10;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {
    public MyStack() {

    }

    public MyStack(int capacity) {
        super(capacity);
    }

    public void push(Object object) {
        super.add(object);
    }

    public Object pop() {
        return super.get(super.size() - 1);
    }

    public Object peek() {
        return super.get(super.size() - 1);
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return super.size() == 0;
    }

    @Override
    public String toString() {
        return "Stack : " + super.toString();
    }
}
