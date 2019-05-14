public class MainApp {
    public static void main(String[] args) {
        SubApp s = new SubApp();
        System.out.println(sum());
        System.out.println(c.sum());
        System.out.println(SubApp.sum());
    }

    static int sum() {
        return 1;
    }
}