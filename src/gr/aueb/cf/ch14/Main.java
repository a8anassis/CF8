package gr.aueb.cf.ch14;

public class Main {

    public static void main(String[] args) {

        Point p1 = Point.getInstance();
        Point p2 = Point.getRandomInstance();

        CodingFactory cf1 = CodingFactory.getInstance();
        CodingFactory cf2 = CodingFactory.getInstance();
        CodingFactory cf3 = CodingFactory.getInstance();

        cf1.sayHello();
        cf2.sayHello();
        cf3.sayHello();
    }
}
