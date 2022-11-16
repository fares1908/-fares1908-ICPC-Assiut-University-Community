import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l= in.nextInt();
        int sum=0;
        for (int i=0;i<l;l++){
            sum=0;
            int num1= in.nextInt();

            int num2= in.nextInt();
            int max=Math.max(num1 , num2);
            int min=Math.min(num1 , num2);
            for(int j=min+1 ;j<max;j++){
               if (j%2 !=0){
                   sum+=j;
               }
            }
            System.out.println(sum);
        }

    }
}

