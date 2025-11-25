package midtermTest.model;

import midtermTest.service.IDebuggable;
import midtermTest.service.IWorkable;

public class Tester extends Employee implements IWorkable{
    int bugsDetectedCount;

    public Tester() {
    }

    public Tester(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public Tester(String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Tester{" +
                "bugsDetectedCount=" + bugsDetectedCount +
                '}';
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + this.getBASE_SALARY_RATE() * this.bugsDetectedCount;
    }

    @Override
    public void work() {

    }
}
