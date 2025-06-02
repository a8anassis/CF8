package gr.aueb.cf.ch18.doubly_linked_list;

public class DoublyLinkedList<T> {
    private Node<T> head = null;
    private Node<T> tail = null;


    /**
     * Time complexity O(1)
     * @param t
     */
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);
        tmp.setPrev(null);

        if (isEmpty()) tail = tmp;
        else head.setPrev(tmp);

        head = tmp;
    }

    /**
     * Time complexity O(1)
     * @param t
     */
    public void insertLast(T t) {
        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);
        tmp.setPrev(tail);

        tail.setNext(tmp);
        tail = tmp;
    }




    public boolean isEmpty() {
        return head == null;
    }
}
