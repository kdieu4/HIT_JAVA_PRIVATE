package BTTL.model;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void move() {
        System.out.println("Cat is moving");
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
