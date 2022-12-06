import java.util.Scanner;

public class B_Even_Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x==1){
            System.out.println(-1);
            return;
        }
        for (int i =1; i <= x; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

