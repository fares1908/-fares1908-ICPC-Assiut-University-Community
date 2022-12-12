import java.util.Scanner;

public class P_Shape_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();//// عدد السطور
        for (int i=y;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}