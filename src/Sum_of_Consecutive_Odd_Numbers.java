import java.util.Scanner;

public class Sum_of_Consecutive_Odd_Numbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int l = in.nextInt();
        for (int x = 0; x < l; x++) {
            sum=0;
            int n = in.nextInt();
            int m = in.nextInt();
            int max=Math.max(n,m); //عشان لو عكس الارقام
            int min=Math.min(n,m);
            for (int i = min+1; i < max; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }

            }
            System.out.println(sum);
        }
    }
}
