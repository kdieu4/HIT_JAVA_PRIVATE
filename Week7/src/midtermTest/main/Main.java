package midtermTest.main;

import midtermTest.constant.Common;
import midtermTest.constant.ErrorMessage;
import midtermTest.constant.SuccessMessage;
import midtermTest.model.Developer;
import midtermTest.model.Device;
import midtermTest.model.Employee;
import midtermTest.model.Tester;
import midtermTest.service.impl.IEmployeeServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* ----- Menu -----
1. In ra danh sách tất cả các nhân viên
2. In ra thông tin nhiên viên theo ID
3. Lọc ra danh sách nhân viên theo Tên
4. Thoát
Hàm calculateSalary được tính như sau:
Developer: basicSalary + BASE_SALARY_RATE * overtimeHours
Tester: basicSalary + BASE_SALARY_RATE * bugsDetectedCount*/

public class Main {
    public static void main(String[] args) {
        IEmployeeServiceImpl.employees.add(new Developer("Nguyễn Văn An", 25, 25000000, new Device("Lenovo"), 2));
        IEmployeeServiceImpl.employees.add(new Developer("Trần Thị Bình", 30, 28000000, new Device("Dell"), 2));
        IEmployeeServiceImpl.employees.add(new Tester("Lê Mạnh Cường", 28, 30000000, new Device("HP"), 18));
        IEmployeeServiceImpl.employees.add(new Tester("Bùi Xuân Trường", 35, 33000000, new Device("ASUS"), 25));
        Scanner scanner = new Scanner(System.in);
        IEmployeeServiceImpl employeeService  = new IEmployeeServiceImpl();
        boolean isContinue = true;
        while (isContinue) {
            System.out.println(Common.MENU);
            System.out.println(Common.ENTER_CHOICE);
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    List<Employee> employees = employeeService.getEmployees();
                    employees.forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Nhập mã nhân viên cần tìm: ");
                    String findingId = scanner.nextLine();
                    Employee foundEmployee = employeeService.getEmployeeById(findingId);
                    if (foundEmployee == null) {
                        System.out.printf(ErrorMessage.ERROR_NOT_FOUND_ID + findingId);
                        continue;
                    }
                    else {
                        System.out.printf(SuccessMessage.SUCCESS_FOUND + findingId);
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên nhân viên cần lọc: ");
                    String findingName = scanner.nextLine();
                    List<Employee> sameNameEmployees = employeeService.getEmployeeByName(findingName);
                    if (sameNameEmployees.isEmpty()) {
                        System.out.printf(ErrorMessage.ERROR_NOT_FOUND_NAME + findingName);
                        continue;
                    }
                    else {
                        System.out.println(Common.SHOW_SAME_NAME_LIST +  sameNameEmployees.toString());
                        for  (int i = 0; i < sameNameEmployees.size(); i++) {
                            System.out.println(sameNameEmployees.get(i).toString());
                        }
                        System.out.println(sameNameEmployees.size());
                    }
                case 4:
                    isContinue = false;
            }
        }
    }
}
