package BTTL.model;

public class Bird extends Animal {
    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public boolean fly() {
        return true;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
