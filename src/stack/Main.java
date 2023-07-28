package stack;

public class Main {

    public static void main(String[] args) {

        MyArrayStack<String> stringMyArrayStack = new MyArrayStack<>();
        stringMyArrayStack.push("A");
        stringMyArrayStack.push("B");
        stringMyArrayStack.push("C");

        System.out.println(stringMyArrayStack.pop());
        System.out.println(stringMyArrayStack.pop());
        System.out.println(stringMyArrayStack.pop());
        System.out.println(stringMyArrayStack.pop());

    }

}
