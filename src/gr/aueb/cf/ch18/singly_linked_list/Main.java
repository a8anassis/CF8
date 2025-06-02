package gr.aueb.cf.ch18.singly_linked_list;

public class Main {

    public static void main(String[] args) {
        SingleList<Integer> list = new SingleList<>();

        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        list.insertLast(6);

        Node<Integer> numNode = list.removeLast();
        int num = numNode.getItem();
        System.out.println("Last item value: " + num);
        System.out.println();

        Node<Integer> num2Node = list.removeFirst();
        int num2 = num2Node.getItem();
        System.out.println("First item value: " + num2);
        System.out.println();

        list.traverse();
        System.out.println("List size: " + list.size());
    }
}
