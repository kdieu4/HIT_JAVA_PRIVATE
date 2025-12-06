package Homework.model;

import Homework.controller.BrokenCarException;

import java.util.Random;

public class Car implements Runnable {
    private String name;
    private double speed;

    public Car() {
    }

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 1; i <= 30; i++) {
                // nextInt(100) trả về 0-99 Nếu < 10 thì là 10%
                if (random.nextInt(100) < 10) {
                    throw new BrokenCarException("Xe " + name + " bị nổ lốp");
                }
                // Mỗi lần lặp, xe sẽ ngủ (sleep) một khoảng thời gian ngẫu nhiên (từ 100ms đến speed ms) để mô phỏng tốc độ khác nhau.
                int sleepTime = 100 + random.nextInt((int)(speed)- 100 + 1);
                Thread.sleep(sleepTime);

                System.out.println("[" + name + "]: Đã chạy được " + i + " km.");
            }
            System.out.println("Chúc mừng: " + name + " đã về đích an toàn!");
        } catch (BrokenCarException e) {
            System.out.println("Sự cố: " + e.getMessage() + " (Dừng cuộc đua)");
        } catch (InterruptedException e) {
            System.out.println("Luồng của " + name + " bị gián đoạn.");
        }

    }
}