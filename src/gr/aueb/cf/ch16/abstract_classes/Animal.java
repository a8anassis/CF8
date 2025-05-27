package gr.aueb.cf.ch16.abstract_classes;

public abstract class Animal {
    private long id;
    private String name;

    public Animal() {

    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " Name: " + name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public abstract void speak();
}
