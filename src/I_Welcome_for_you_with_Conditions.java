import java.util.Scanner;

public class I_Welcome_for_you_with_Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        if(x>=y){
            System.out.println("Yes");

        }else{
            System.out.println("No");
        }
    }
}