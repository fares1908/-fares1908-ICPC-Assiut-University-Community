import java.util.Scanner;

public class L_GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        int x = in.nextInt();
          int v=0;
        for (int i = 1; i <= x; i++) {

            if(x%i==0&&y%i==0){
               v=i;

            }

        }
        System.out.println(v);
    }
}
