package InClass;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread đang chạy công việc A");
    }
}

//public class Main {
//    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//    }
//}
