public class Exercise04_dowhile{
    public static void main(String[]args){
        int sum=0;

        do{
            int diceA=(int)(Math.random()*6)+1;
            int diceB=(int)(Math.random()*6)+1;

            System.out.println("(" + diceA + "," + diceB + ")");
            
            sum=diceA+diceB;
        }while(sum!=5);
    }
}