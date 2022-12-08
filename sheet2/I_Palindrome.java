import java.util.Scanner;

public class I_Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r,sum=0,temp;
       int n = in.nextInt();//It is the number variable to be checked for palindrome

        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println(sum +"\n"+"YES");
        else
            System.out.println(sum +"\n"+"NO");
    }
}