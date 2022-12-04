import java.util.Scanner;

import static java.lang.Math.*;

public class X_Two_intervals {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Long l1 = in.nextLong();
        Long r1 = in.nextLong();
        Long l2 = in.nextLong();
        Long r2 = in.nextLong();
        if(Math.max(l1,l2)>Math.min(r1,r2)){
            System.out.println(-1);
        }else {
            System.out.println(Math.max(l1,l2) + " "+ Math.min(r1,r2));
        }

    }
}
