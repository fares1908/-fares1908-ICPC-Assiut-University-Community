import java.util.Scanner;

public class H_One_Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        boolean a=false;
        for (long i=2;i<x;i++) {
            if (x % i == 0) {
                a = true;
                break;

            }
        }
        if (a==true){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }

    }
}