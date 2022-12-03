import java.util.Scanner;

public class P_First_digit {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();

            if(x.charAt(0)%2==0){
                System.out.println("EVEN");
            }else {
                System.out.println("ODD");
            }

    }
}