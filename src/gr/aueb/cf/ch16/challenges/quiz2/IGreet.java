package gr.aueb.cf.ch16.challenges.quiz2;

public interface IGreet {

    default void sayHello() {
        System.out.println("Hello!");
    }
}
