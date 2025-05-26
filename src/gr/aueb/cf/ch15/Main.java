package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {

        Point[] points = new Point[] {
          new Point(1), new Point2D(2, 6), new Point3D(1, 8, 9), new Point3D(0, 4, 1)
        };

        for (Point point : points) {
            if (point instanceof Point3D) {
                System.out.println("Point 3d: " + point);
            } else if (point instanceof Point2D) {
                System.out.println("Point 2d: " + point);
            } else {
                System.out.println("Point: " + point);
            }
        }

        Point p1 = new Point(4);
        Point p2 = new Point2D(5, 8);
        Point p3 = new Point3D();

        p1.movePlusOne();
        p2.movePlusOne();
        p3.movePlusOne();

        doMovePlusOne(p3);
        doMovePlusOne(p2);
        doMovePlusOne(p1);

        System.out.println(p1);     // η παράμετρος της println είναι ένα String context
        System.out.println(p2);
        System.out.println(p3);
    }


    public static void doMovePlusOne(Point point) {
        point.movePlusOne();            // late-binding, @runtime
    }
}
