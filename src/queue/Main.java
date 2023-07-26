package queue;

public class Main {

    public static void main(String[] args) {
        MyArrayQueue<String> stringMyArrayQueue = new MyArrayQueue<>();
        stringMyArrayQueue.enQueue("A");
        stringMyArrayQueue.enQueue("B");
        stringMyArrayQueue.enQueue("C");
        stringMyArrayQueue.enQueue("D");

        System.out.println(stringMyArrayQueue.deQueue());
        System.out.println(stringMyArrayQueue.deQueue());
        System.out.println(stringMyArrayQueue.deQueue());
        System.out.println(stringMyArrayQueue.deQueue());

    }



}
