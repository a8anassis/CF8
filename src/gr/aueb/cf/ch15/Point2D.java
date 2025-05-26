package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private double y;

    public Point2D() {
        super();
    }

    public Point2D(double x, double y) {
        super(x);       // καλεί ρητά τον υπερφορτωμένο constructor
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    protected void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    public String toString() {
        return "{" + getX() + ", " + y + "}";
    }
}
