import java.util.Scanner;

public class O_Pyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();//عدد السطور
        for (int i=1;i<=y;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
