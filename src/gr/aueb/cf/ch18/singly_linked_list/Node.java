package gr.aueb.cf.ch18.singly_linked_list;

/**
 * List node.
 * @param <T>   παραμετρικός τύπος.
 */
public class Node<T> {
    private T item;
    private Node<T> next;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
