package view;

import Homework.model.Car;

public class Main {
    public static void main(String[] args) {
        System.out.println("===CUỘC ĐUA BẮT ĐẦU===");
        Car car1 = new Car ("Ferrari", 200);
        Car car2 = new Car ("Toyota", 400);
        Car car3 = new Car ("Ford", 600);

        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);
        Thread t3 = new Thread(car3);


        t1.start();
        t2.start();
        t3.start();
    }
}
