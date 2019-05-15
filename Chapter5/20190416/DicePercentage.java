public class DicePercentage {
    public static void main(String[]args){
        int[]diceTime=new int[6];
        int trial=0;

        while(trial <= 100000000){
            trial++;
            diceTime[(int)(Math.random() * diceTime.length)]++;
        }

        for(int i=0;i<diceTime.length;i++){
           System.out.println((i+1) + " (" + (diceTime[i]/(double)trial) + ")");
        }
    }
}