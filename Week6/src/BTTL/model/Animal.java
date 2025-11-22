package BTTL.model;

import BTTL.service.Flyable;
import BTTL.service.Swimmable;

public abstract class Animal implements Flyable, Swimmable {
    protected String name;
    protected int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void makeSound() {
    }

    ;

    public void eat() {
    }

    ;

    public void move() {
    }

    ;

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return false;
    }
}
