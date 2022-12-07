import java.util.Scanner;

public class E_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        int [] arr=new int[x];
        int max=arr[0];
        for (int i =0;i< arr.length;i++){
            arr[i]= in.nextInt();
        }
        for (int i =0;i< arr.length;i++){
            if (arr[i]>max){
             max=arr[i];

            }
        }
        System.out.println(max);
    }
}