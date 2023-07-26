package queue;

import linkedlist.MyLinkedList;

public class MyLinkedQueue<E> {

    private int size;
    private final MyLinkedList<E> linkedList;

    public MyLinkedQueue() {
        this.size = 0;
        this.linkedList = new MyLinkedList<>();
    }

    public void add(E addData) {
        linkedList.add(addData);
        size++;
    }

    public E poll() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        E returnData = linkedList.get(0);

        linkedList.remove(0);
        size--;
        return returnData;
    }

    public E peek() {
        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return linkedList.get(0);
    }

    public void clear() {
        linkedList.clear();
        size = 0;
    }
}
