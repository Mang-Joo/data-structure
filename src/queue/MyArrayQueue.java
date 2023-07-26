package queue;

public class MyArrayQueue<E> {

    private Object[] queue;
    private int cursor;

    public MyArrayQueue() {
        this.queue = new Object[10];
        this.cursor = 0;
    }

    private MyArrayQueue(Object[] queue, int cursor) {
        this.queue = queue;
        this.cursor = cursor;
    }

    public void enQueue(E data) {
        if (data == null) {
            throw new IllegalArgumentException("Can not add null");
        }
        if (queue.length == cursor) {
            Object[] next = new Object[cursor * 2];
            System.arraycopy(queue, 0, next, 0, queue.length);
            this.queue = next;
        }
        queue[cursor++] = data;
    }

    public E deQueue() {
        if (cursor == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        cursor--;
        E e = (E) queue[0];
        System.arraycopy(queue, 1, queue, 0, cursor);
        return e;
    }

    public int size() {
        return cursor;
    }
}
