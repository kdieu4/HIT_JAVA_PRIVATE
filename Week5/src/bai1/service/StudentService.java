package service;

import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    private static ArrayList<Student> students = new ArrayList<>();

    public StudentService() {
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void setStudents(ArrayList<Student> students) {
        StudentService.students = students;
    }

    public void add(Scanner scanner) {
        String isContinue;
        do {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên lớp: ");
            String className = scanner.nextLine();

            Student newStudent = new Student(name, age, className);
            if (newStudent.getName().isEmpty() || newStudent.getAge() == 0 || newStudent.getClassName().isEmpty()) {
                System.out.println("Thông tin không hợp lệ!");
                return;
            }

            students.add(newStudent);
            System.out.println("Nhập thêm thành công");

            System.out.println("Bạn có muốn nhập tiếp không? (y/n)");
            isContinue = scanner.nextLine();
        } while (isContinue.equalsIgnoreCase("y"));
    }

    private Student getStudentByName(String name) {
        for (Student student : students) {
            if (student.getName().contains(name)) {
                return student;
            }
        }
        return null;
    }

    public void update(Scanner scanner) {
        System.out.println("Nhập tên học sinh cần sửa: ");
        String name = scanner.nextLine();
        Student student = getStudentByName(name);
        if (student != null) {
            System.out.println("Thông tin trước khi sửa là " + student.toString());
            System.out.println("Nhập tuổi cần sửa (Nhập -1 nếu không cần sửa): ");
            int age = Integer.parseInt(scanner.nextLine());
            if (age != -1) {
                student.setAge(age);
            }
            System.out.println("Nhập tên lớp cần sửa (Bỏ trống nếu không cần sửa): ");
            String className = scanner.nextLine();
            if (className != null) {
                student.setClassName(className);
            }
            System.out.println("Sửa thông tin thành công!");
        } else {
            System.out.println("Không tìm thấy học sinh cần sửa!");
        }
    }

    public void delete(Scanner scanner) {
        System.out.println("Nhập tên học sinh cần xóa: ");
        String name = scanner.nextLine();
        Student student = getStudentByName(name);
        if (student != null) {
            students.remove(student);
            System.out.println("Đã xóa học sinh thành công");
        } else {
            System.out.println("Không tìm thấy học sinh cần xóa!");
        }
    }

    public Student getByClassName(Scanner scanner) {
        System.out.println("Nhập tên lớp cần tìm: ");
        String className = scanner.nextLine();
        for (Student student : students) {
            if (student.getClassName().equalsIgnoreCase(className)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "StudentService{}";
    }
}
