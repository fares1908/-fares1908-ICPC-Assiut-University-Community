import java.util.Scanner;

public class Summation_from_1_to_n{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long l= in.nextLong();
        long sum=(l*(l+1))/2;
        System.out.println(sum);
    }
}