package gr.aueb.cf.ch18;

public class NodeGeneric<T> {
    private T item;

    public NodeGeneric() {

    }

    public NodeGeneric(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "NodeGeneric{" +
                "item=" + item +
                '}';
    }
}
