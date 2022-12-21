import java.util.Scanner;

public class T_Shape2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();

        for (int i=1;i<=x;i++){//عدد الخطوط
            for (int s=0;s<x-i;s++)//المساحات الفاضيه
                System.out.print(" ");
               for (int k=1;k<=(i*2)-1;k++)
                   System.out.print("*");
            System.out.println();
            }
        for (int i=x;i>=1;i--){
            for (int s=x-i;s>0;s--)
                System.out.print(" ");
            for (int k=1;k<=(i*2)-1;k++)
                System.out.print("*");
            System.out.println();
        }


    }
}