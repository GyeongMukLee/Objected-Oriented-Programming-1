public class ArrayCreateByValueListExample1{
    public static void main(String[]args){
        int[] arr={83,90,87,92};
        int sum=0;
        sum=arr[0]+arr[1]+arr[2]+arr[3];

        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }
        System.out.println("sum: "+sum);
        System.out.println("average: "+sum/4.0);
    }
}