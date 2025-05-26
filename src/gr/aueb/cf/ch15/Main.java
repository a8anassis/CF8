package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(4);
        Point p2 = new Point2D(5, 8);
        Point p3 = new Point3D();

        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlusOne(p3);
        doMovePlusOne(p2);
        doMovePlusOne(p1);
    }


    public static void doMovePlusOne(Point point) {
        point.movePlusOne();
    }
}
