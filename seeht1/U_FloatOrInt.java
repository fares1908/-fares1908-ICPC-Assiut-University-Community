import java.util.Scanner;

public class U_FloatOrInt {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        int y = (int) x;
        if(x-y>0){
            System.out.print("float "+y+ " ");

            System.out.print(x-y);
        }else {
            System.out.println("int "+y);
        }

    }
}