package gr.aueb.cf.ch15.quiz.quiz2;

public class Test {
    private static int x = 10;
    private int y;

    public Test(int y) {
        this.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        Test.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
