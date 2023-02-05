import java.util.Scanner;

public class Y_Easy_Fibonacci {
    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int fib=in.nextInt();
//        for (int i=0 ;i<fib;i++){
//            System.out.print(fib(i)+" ");
//        }
//
//    }
//    public static int fib (int x){
//        if(x==0)return 0;
//        if(x==1)return 1;
//        else
//            return fib(x-1)+fib(x-2);
//
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int n1=0;
        int n2=1;
        int sum=0;
        System.out.print(n1 +" "+n2);
        for (int i =2;i<x;i++){
            sum=n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}