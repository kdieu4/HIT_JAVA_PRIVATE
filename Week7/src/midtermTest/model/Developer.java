package midtermTest.model;

import midtermTest.service.IDebuggable;
import midtermTest.service.IWorkable;

public class Developer extends Employee implements IDebuggable, IWorkable {
    private int overtimeHours;

    public Developer() {
    }

    public Developer(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public Developer(String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public String toString() {
        return super.toString() + "Developer{" +
                "overtimeHours=" + overtimeHours +
                '}';
    }

    @Override
    public double calculateSalary() {
        return this.getBasicSalary() + this.getBASE_SALARY_RATE() * overtimeHours;
    }

    @Override
    public void fixBug() {

    }

    @Override
    public void work() {

    }
}
