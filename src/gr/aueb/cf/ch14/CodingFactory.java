package gr.aueb.cf.ch14;

public class CodingFactory {
    private static final CodingFactory INSTANCE = new CodingFactory();  // pre-defined instance

    private CodingFactory() {

    }

    public static CodingFactory getInstance() {
        return INSTANCE;
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
