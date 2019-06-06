public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Sub());

        th1.start();
        System.out.println("Hello, ");
    }
}