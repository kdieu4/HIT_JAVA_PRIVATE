package InClass;

class InvalidCalculateException extends RuntimeException {
    public InvalidCalculateException(String message) {
        super(message);
        System.out.println(message);
    }
}

//class Main {
//    public static void main(String[] args) throws InvalidCalculateException {
//        try {
//            int a = 5, b = 0;
//            System.out.println(a/b);
//        } catch (Exception e) {
//            throw new InvalidCalculateException("Tính toán xảy ra lỗi");
//        } finally {
//            System.out.println("Hoàn thành việc tính toán");
//        }
//    }
//}