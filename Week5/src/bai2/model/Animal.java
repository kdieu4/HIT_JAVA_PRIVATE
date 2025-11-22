package bai2.model;

import java.util.UUID;

public class Animal {
    private String id;
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
    }

    public void showInfo(){
        System.out.printf("%-20s %-20s %-20d\n", this.id, this.name, this.age);
    }

    public void makeSound(){
        System.out.println("Making Sound");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
