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