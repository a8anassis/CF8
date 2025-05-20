package gr.aueb.cf.ch12;

public class PointMain {

    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(2, 3);
        Point p3 = new Point(6, 12);
        Point p4 = new Point(0, 16);
        Point p5 = new Point(20, 12);

        p4.setX(10);

        System.out.println("Number of instances: " + Point.getNumberOfPoints());

    }
}
