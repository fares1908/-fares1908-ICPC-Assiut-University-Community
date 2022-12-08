import java.util.Scanner;

public class F_Multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for(int i =1; i<=12;i++){
            System.out.print(x +" ");
            System.out.print("*" +" ");
            System.out.print(i +" ");
            System.out.print("=" +" ");
            System.out.println(x*i);
        }
    }
}