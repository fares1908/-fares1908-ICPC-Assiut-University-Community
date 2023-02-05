import java.util.Scanner;

public class X_Convert_To_Decimal_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();


        while (x-->0){
             long num=in.nextLong();
             int ones=0;
             while (num>0){
                 if (num%2==1){
                     ones++;
                 }
                 num=num/2;
             }
             long sum =0;
             for (int j=0;j<ones;j++){
                 sum+=1*Math.pow(2,j);
             }
             System.out.println(sum);
         }


    }
}