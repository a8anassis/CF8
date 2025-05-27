package gr.aueb.cf.ch16.abstract_classes;

public class Cat extends Animal {

    public Cat() {
        // super();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Cat ate all her food.");
    }

    @Override
    public void speak() {
        System.out.println("Caty says hi!");
    }
}
