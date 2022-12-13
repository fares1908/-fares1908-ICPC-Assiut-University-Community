import java.util.Scanner;

public class Q_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i=0;i<n;i++){
            int x= in.nextInt();
            if(x==0){
                System.out.println(0);
                continue;
            }
            while (x!=0) {
                int y = x % 10;
                System.out.print(y + " ");
                x = x / 10;
            }
            System.out.println();
        }
    }
}
//حل اخر
/*
import java.util.Scanner;

public class Q_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

       while (n>0){
            String x = in.next();

            for (int j = x.length() - 1; j >= 0; j--) {
                System.out.print(x.charAt(j) + " ");
            }
            System.out.println();
            n--;


        }
    }
}
*/
