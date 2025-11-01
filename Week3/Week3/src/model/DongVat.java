package model;

public class DongVat {
    private String name;
    private int year;
    private String description;
    private double weight;

    public DongVat(String name, int year, String description, double weight) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.weight = weight;
    }

    public DongVat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DongVat{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Description: " + description);
        System.out.println("Weight: " + weight);
    }
}
