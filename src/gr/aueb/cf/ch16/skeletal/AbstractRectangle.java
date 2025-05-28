package gr.aueb.cf.ch16.skeletal;

public abstract class AbstractRectangle implements IRectangle {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }
}
