package gr.aueb.cf.ch18;

public class Main {

    public static void main(String[] args) {

        NodeGeneric<Integer> intNode = new NodeGeneric<>();
        NodeGeneric<String> strNode = new NodeGeneric<>();
        var nodeDouble = new NodeGeneric<Double>();

        intNode.setItem(3);
        // intNode.setItem("xxx"); compile-time safety

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArr = {"Athens", "Paris", "London"};

        printArray(intArray);
        printArray(strArr);

    }

    public static <T> void printArray(T[] arr) {
        for (T item : arr) {
            System.out.println(item);
        }
    }


    public static void print(NodeGeneric<?> node) {
        System.out.println(node.getItem());
    }

    public static void print2(NodeGeneric<? extends Number> node) {
        System.out.println(node.getItem());
    }
}
