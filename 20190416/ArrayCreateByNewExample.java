public class ArrayCreateByNewExample{
    public static void main(String[]args){
        int[] arr=new int[]{50,16,8,62};
        int sum=0;

        for(int i=0;i<arr.length;i++){  //배열의 .length에는 배열의 길이가 저장되어있다
            sum=sum+arr[i];
        }

        System.out.println("sum: " + sum);
        System.out.println("average: " + (double)(sum/arr.length));
    }
}