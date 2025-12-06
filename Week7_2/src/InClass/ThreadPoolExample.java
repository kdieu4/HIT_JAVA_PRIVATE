package InClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Tạo một hồ chứa chỉ có 3 nhân viên (Threads)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Gửi 10 công việc vào
        for (int i = 0; i < 10; i++) {
            int taskId = i;
            executor.submit(() -> {
                System.out.println("Nhân viên " + Thread.currentThread().getName() + " đang xử lý task " + taskId);
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            });
        }
        executor.shutdown(); // Đóng cửa sau khi làm hết việc
    }
}