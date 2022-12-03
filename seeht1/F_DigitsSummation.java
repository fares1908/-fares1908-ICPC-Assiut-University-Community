import java.util.Scanner;

public class DigitsSummation {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        long x =in.nextLong();
        long y=in.nextLong();
        long sum=(x%10)+(y%10);
        System.out.println(sum);
    }
}
