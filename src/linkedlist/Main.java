package linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> stringMyLinkedList = new MyLinkedList<>();
        stringMyLinkedList.add("A");
        stringMyLinkedList.add("B");
        stringMyLinkedList.add("C");
        stringMyLinkedList.add("D");
        System.out.println("stringMyLinkedList.get(0) = " + stringMyLinkedList.get(0));
        System.out.println("stringMyLinkedList.get(1) = " + stringMyLinkedList.get(1));
        System.out.println("stringMyLinkedList.get(2) = " + stringMyLinkedList.get(2));
        System.out.println("stringMyLinkedList.get(3) = " + stringMyLinkedList.get(3));

        stringMyLinkedList.remove(3);
        stringMyLinkedList.remove(2);
        stringMyLinkedList.remove(1);
        stringMyLinkedList.remove(0);

        System.out.println("stringMyLinkedList = " + stringMyLinkedList.get(0));

    }

}
