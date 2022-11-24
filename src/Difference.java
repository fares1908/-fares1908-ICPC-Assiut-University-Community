import java.util.Scanner;

/**
 *
 * @author fares
 */
public class Difference {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        long a =in.nextLong();
        long b=in.nextLong();
        long c =in.nextLong();
        long d=in.nextLong();
        long Difference=  ((a*b)-(c*d));
        System.out.print("Difference = ");
        System.out.print( Difference);

    }
}