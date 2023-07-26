package linkedlist;

public class MyLinkedList<E> {

    private int size;
    private Node first;
    private Node last;


    private class Node {

        private Node prev;
        private E data;
        private Node next;

        public Node(E data) {
            this.prev = null;
            this.data = data;
            this.next = null;
        }
    }

    public void add(E addData) {
        if (addData == null) {
            throw new IllegalArgumentException("Can not add null");
        }
        if (first == null) {
            first = new Node(addData);
            size++;
            return;
        }
        if (last == null) {
            last = new Node(addData);
            first.next = last;
            last.prev = first;
            size++;
            return;
        }
        Node add = new Node(addData);
        searchByIndex(size).next = add;
        last = add;
        size++;
    }

    public void remove(int index) {
        if (index == 0) {
            first = first.next;
        } else {
            Node node = searchByIndex(index);
            node.prev.next = node.next;
        }
        size--;
    }

    public E get(int index) {
        return searchByIndex(index).data;
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
            for (int i = size; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }
}
