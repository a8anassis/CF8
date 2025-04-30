package gr.aueb.cf.ch6;

import java.util.Arrays;

public class QueueApp {
    final static int QUEUE_SIZE = 50;
    static int[] queue = new int[QUEUE_SIZE];
    static int top = -1;

    public static void main(String[] args) {
        enQueue(1);
        enQueue(2);
        enQueue(3);
        printQueue();
        int num = deQueue();
        System.out.println(num);
        printQueue();
    }

    public static void enQueue(int num) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++top] = num;
    }

    public static int deQueue() {
        int num;
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        num = queue[0];
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);
        top--;
        return num;
    }

    public static boolean isFull() {
        return top == queue.length - 1;
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static void printQueue() {
        if (isEmpty()) throw new RuntimeException("Empty Queue");

        for (int i = 0; i <= top; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
    }
}
