package midtermTest.service;

import midtermTest.model.Employee;

import java.util.List;

public interface IEmployeeService {
    public List<Employee> getEmployees();
    public Employee getEmployeeById(String id);
    public List<Employee> getEmployeeByName(String name);
}
