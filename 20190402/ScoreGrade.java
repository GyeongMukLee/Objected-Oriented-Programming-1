import java.util.*;

class ScoreGrade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int myScore = Integer.parseInt(sc.nextLine());
        System.out.println("Score: " + myScore);
        sc.close();

        switch(myScore/10){
            case 10:
            case 9:
                System.out.println("A");
                break;

            case 8:
                System.out.println("B");
                break;

            case 7:
                System.out.println("C");
                break;

            default:
                System.out.println("D");
        }
    }
}