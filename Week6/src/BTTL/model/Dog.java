package BTTL.model;

import BTTL.service.IAnimalService;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is making sound");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
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
