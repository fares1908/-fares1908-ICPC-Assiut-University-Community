import java.util.Scanner;

public class S_Sum_of_Consecutive_Odd_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int min = Math.min(x, y);
            int max = Math.max(x, y);

            for (int j = min; j <= max; j++) {
                if (j % 2 != 0&&j!=min&&j!=max) {
                    sum+=j;
                }


            }
            System.out.println(sum);
            sum=0;


        }

    }
}
