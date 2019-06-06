public class Main2 {
    public static void main(String[] args) {
        Thread th1 = new Thread() {
            // 익명 구현 객체
            public void run() {
                System.out.println("익명 객체");
            }
        };

        th1.start();
    }
}