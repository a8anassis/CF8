package gr.aueb.cf.ch15.quiz.quiz2;

public class Main {

    public static void main(String[] args) {
        Test test1 = new Test(200);
        Test.setX(100);

        Test test2 = new Test(20);
        System.out.println(Test.getX() + " " + test2.getY());
    }
}
