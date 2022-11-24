import java.util.Scanner;

/**
 *
 * @author fares
 */
public class SimpleCalculatur {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        long x =in.nextLong();
        long y=in.nextLong();
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x+y);
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x*y);
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x-y);
    }
}
