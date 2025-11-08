package inClass.domain;

public class Employee {
    private int id;
    private String name;
    private String country;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String country, double salary) {
        this.name = name;
        this.country = country;
        this.salary = salary;
    }

    public Employee(int id, String name, String country, double salary) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("work");
    }
}
