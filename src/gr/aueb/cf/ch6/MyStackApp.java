package gr.aueb.cf.ch6;

public class MyStackApp {
    final static int STACK_SIZE = 50;
    static int[] stack = new int[STACK_SIZE];
    static int top = -1;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        printStack();

        int num = pop();
        System.out.println("Popped: " + num);

        printStack();

    }

    public static void push(int num) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }

        stack[++top] = num;
//        top++;
//        stack[top] = num;
    }

    public static int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public static boolean isFull() {
        return top == stack.length - 1;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void printStack() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
