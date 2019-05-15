import java.util.Scanner;

class NineMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = Integer.parseInt(sc.nextLine());
        sc.close();

        System.out.println("===" + line + "===");
        for (int i = 2; i <= 9; i++) {
            System.out.println(line + " * " + i + " = " + line * i);
        }
    }
}