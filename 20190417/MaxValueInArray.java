import java.util.Scanner;

public class MaxValueInArray{
    public static void main(String[]args){
        int[]arr=new int[10];
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            if(max<=arr[i]){
                max=arr[i];
            }
        }
        sc.close();

        for(int n:arr){
            System.out.printf("[%2d] ",n);
        }
        
        System.out.println("max: " + max);
    }
}