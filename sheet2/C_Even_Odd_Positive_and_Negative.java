import java.util.Scanner;

public class C_Even_Odd_Positive_and_Negative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int even=0;
        int odd=0;
        int postive=0;
        int negative=0;
        int [] arr =new int[x];
        for (int i =0;i< arr.length;i++){
            arr[i]=in.nextInt();
        }
        for (int j = 0 ;j<arr.length;j++){
            if(arr[j]%2==0){
                even++;
            }else{
                odd++;
            }


        }
        for (int j = 0 ;j<arr.length;j++){
            if(arr[j]>0){
                postive++;
            }else if (arr[j]<0){
                negative++;
            }


        }

        System.out.println("Even:" +" "+even);
        System.out.println("Odd:" +" "+odd);
        System.out.println("Positive:" +" "+postive);
        System.out.println("Negative:" +" "+negative);


    }
}