import java.util.Scanner;

public class J_Primes_from_1_to_n {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();

      for (int i = 2; i <= x ; i ++) {
            for (int k = 2; k <= i; k ++) {

                if (i % k == 0 && i != k) {
                    break;
                }

                if (i % k == 0 && i == k) {
                    System.out.print(i +" ");
                }
            }
        }
    }
}
