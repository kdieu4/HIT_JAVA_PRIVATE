package bai2.model;

public class Lion extends Animal{
    private double weight;

    public Lion(double weight) {
        this.weight = weight;
    }

    public Lion(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "weight=" + weight +
                '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Gào!!");

    }
}
