package linkedlist;

public class MyLinkedList<E> {

    private int size;
    private Node first;
    private Node last;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", first=" + first +
                ", last=" + last +
                '}';
    }

    private class Node {

        private Node prev;
        private final E data;
        private Node next;

        public Node(E data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }

        public Node(Node prev, E data) {
            this.prev = prev;
            this.data = data;
        }
    }

    public void add(E addData) {
        if (addData == null) {
            throw new IllegalArgumentException("Can not add null");
        }
        final Node lastNode = last;
        final Node addNode = new Node(lastNode, addData);
        last = addNode;
        if (lastNode == null) {
            first = addNode;
        } else {
            lastNode.next = addNode;
        }

        size++;
    }

    public void remove(int index) {
        checkIndex(index);
        Node temp = searchByIndex(index);

        Node prev = temp.prev;
        Node next = temp.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            temp.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            temp.next = null;
        }

        size--;
    }

    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    public E get(int index) {
        checkIndex(index);
        return searchByIndex(index).data;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }

    private Node searchByIndex(int index) {
        if (index == 0) {
            return first;
        }
        Node temp;
        if (index <= size / 2) {
            temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = last;
            for (int i = size - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
}
