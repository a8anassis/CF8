package gr.aueb.cf.ch18.singly_linked_list;

public class SingleList<T> {
    private Node<T> head = null;

    /**
     * Time complexity is O(1)
     * @param t
     */
    public void insertFirst(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);

        head = tmp;
    }

    /**
     * Time complexity O(n)
     * @param t
     */
    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if (isEmpty()) {
            insertFirst(t);
            return;
        }

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) {

        }
        n.setNext(tmp);
    }

    /**
     * Time complexity O(1)
     * @return
     */
    public Node<T> removeFirst() {
        if (isEmpty()) return null;

        Node<T> node = head;
        head = head.getNext();
        return node;
    }

    /**
     * Time complexity O(n)
     * @return
     */
    public Node<T> removeLast() {
        if (isEmpty() || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n= n.getNext()) {}

        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }

    /**
     * Time complexity O(n).
     *
     * @param t
     * @return
     */
    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
                break;
            }
        }
        return nodeToReturn;
    }

    /**
     * Διασχίζει τη λίστα και εκτυπώνει την τιμή
     * κάθε κόμβου της λίστας. Time complexity O(n)
     */
    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }

    public int size() {
        int counter = 0;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            counter++;
        }

        return counter;
    }


    public boolean isEmpty() {
        return head == null;
    }

}
