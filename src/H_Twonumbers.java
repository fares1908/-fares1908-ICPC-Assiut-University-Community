import java.util.Scanner;

import static java.lang.Math.*;

public class H_Twonumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double x = (int)in.nextDouble();
        double y = (int)in.nextDouble();
        double result = (int )x/y;
        System.out.print("floor ");
        System.out.print((int)x);
        System.out.print(" / ");
        System.out.print((int)y);
        System.out.print(" = ");
        System.out.println((int)floor(result));

        System.out.print("ceil ");
        System.out.print((int)x);
        System.out.print(" / ");
        System.out.print((int)y);
        System.out.print(" = ");
        System.out.println((int)ceil(result));

        System.out.print("round ");
        System.out.print((int)x);
        System.out.print(" / ");
        System.out.print((int)y);
        System.out.print(" = ");
        System.out.println((int)round(result));


    }
}