package midtermTest.service.impl;

import midtermTest.model.Employee;
import midtermTest.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    public static final ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
//                System.out.println(employee.getId());
                return employee;
            }
        }
        return null;
    }

    @Override
    public List<Employee> getEmployeeByName(String name) {
        List<Employee> res =  new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                res.add(employee);
                System.out.println("--");
            }
        }
        return res;
    }
}
