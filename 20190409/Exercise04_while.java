public class Exercise04_while{
    public static void main(String[]args){
        int sum=0;

        while(sum!=5){
            int diceA=(int)(Math.random()*6)+1;
            int diceB=(int)(Math.random()*6)+1;

            System.out.println("(" + diceA + "," + diceB + ")");
            
            sum=diceA+diceB;
        }

        System.out.println("Game Over!");
    }
}