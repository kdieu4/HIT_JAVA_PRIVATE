package midtermTest.model;

import java.util.UUID;

public abstract class Employee {
    private static int employeeCount;
    private final double BASE_SALARY_RATE = 500000;
    private String id;
    private String name;
    private int age;
    private double basicSalary;
    private Device device;


    public Employee() {
    }

    public Employee(String name, int age, double basicSalary, Device device) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.device = device;
    }

//    public Employee(Device device, int age, String name) {
//        this.id = UUID.randomUUID().toString();
//        this.device = device;
//        this.age = age;
//        this.basicSalary = BASE_SALARY_RATE;
//        this.name = name;
//    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public double getBASE_SALARY_RATE() {
        return BASE_SALARY_RATE;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    }

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

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device +
                '}';
    }

    public abstract double calculateSalary();
}
