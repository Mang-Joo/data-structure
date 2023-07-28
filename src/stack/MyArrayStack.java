package stack;

public class MyArrayStack<E> {

    private Object[] stack;
    private int size;

    private int cursor;

    public MyArrayStack() {
        this.stack = new Object[10];
        this.size = 0;
    }

    public void push(E data) {
        if (data == null) {
            throw new IllegalArgumentException("Can not add null");
        }
        if (stack.length == size) {
            Object[] next = new Object[size * 2];
            System.arraycopy(stack, 0, next, 0, stack.length);
            this.stack = next;
        }
        stack[size++] = data;
    }

    public E pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        E e = (E) stack[size - 1];
        stack[size - 1] = null;
        size--;
        return e;
    }



}
