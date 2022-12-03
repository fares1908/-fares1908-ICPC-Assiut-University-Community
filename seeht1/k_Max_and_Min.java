import java.util.Scanner;

public class k_Max_and_Min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        long z = in.nextLong();
        long min;
        long max;

        if(x>=y&&x>=z){
            max=x;
        } else if (y>=x&&y>=z) {
            max=y;
        }
        else
        {
            max=z;
        }

        if(x<=y&&x<=z){
            min=x;
        } else if (y<=x&&y<=z) {
            min=y;
        }
        else
        {
            min=z;
        }
        System.out.print(min);
        System.out.print(" "+max);

    }
}