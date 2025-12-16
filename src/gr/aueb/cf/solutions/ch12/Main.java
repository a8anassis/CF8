package gr.aueb.cf.solutions.ch12;

public class Main {

    public static void main(String[] args) {
        PointXYZ p = new PointXYZ(1, 2, 3);
        double distanceXY;
        double distanceXZ;
        double distanceYZ;
        double distanceXYZ;

        distanceXY = p.getXYDistance();
        distanceXZ = p.getXZDistance();
        distanceYZ = p.getYZDistance();
        distanceXYZ = p.getXYZDistance();

        System.out.println("XY Distance: " + distanceXY);
        System.out.println("XZ Distance: " + distanceXZ);
        System.out.println("YZ Distance" + distanceYZ);
        System.out.println("XYZ Distance: " + distanceXYZ);
    }
}
