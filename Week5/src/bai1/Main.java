package bai1;

import bai1.model.Student;
import bai1.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static final ArrayList<Student> students = StudentService.getStudents();

    public static void main(String[] args) {
//        StudentService studentService =  new StudentService();
//        students.add(new Student("Nguyễn Văn An", 19, "KTPM01"));
//        students.add(new Student("Trần Thị Bình", 19, "KTPM02"));
//        students.add(new Student("Lê Thanh Bình", 19, "KTPM03"));
//        Scanner scanner  = new Scanner(System.in);
//        show(students);
//        studentService.add(scanner);
//        show(students);
//        studentService.update(scanner);
//        show(students);
//        studentService.delete(scanner);
//        show(students);

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        List<String> filterList = list.stream().filter(element -> element.equals("a")).collect(Collectors.toList());
        System.out.println(filterList);
    }

    private static void show(ArrayList<Student> students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}