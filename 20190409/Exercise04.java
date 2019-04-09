public class Exercise04{
    public static void main(String[]args){
        int sum=0;
        do{
            int diceA=0;
            int diceB=0;

            diceA=(int)(Math.random()*6)+1;
            diceB=(int)(Math.random()*6)+1;

            System.out.println("(" + diceA + "," + diceB + ")");
            
            sum=diceA+diceB;
        } while(sum==5);
    }
}