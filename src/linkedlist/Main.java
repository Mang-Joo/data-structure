package linkedlist;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> testLinkedList = new MyLinkedList<>();
        testLinkedList.add("A");
        testLinkedList.add("B");
        testLinkedList.add("C");
        testLinkedList.add("D");
        System.out.println("stringMyLinkedList.get(0) = " + testLinkedList.get(0));
        System.out.println("stringMyLinkedList.get(1) = " + testLinkedList.get(1));
        System.out.println("stringMyLinkedList.get(2) = " + testLinkedList.get(2));
        System.out.println("stringMyLinkedList.get(3) = " + testLinkedList.get(3));

        testLinkedList.remove(3);
        testLinkedList.remove(2);
        testLinkedList.remove(1);

        System.out.println("stringMyLinkedList = " + testLinkedList.get(0));

        testLinkedList.clear();
        System.out.println("testLinkedList.get(0) = " + testLinkedList.get(0));
    }

}
