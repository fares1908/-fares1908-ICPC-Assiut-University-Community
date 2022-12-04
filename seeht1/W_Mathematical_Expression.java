import java.util.Scanner;

public class W_Mathematical_Expression {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Long x = in.nextLong();
        String sign = in.next();
        Long y = in.nextLong();
        String s = in.next();
        long z= in.nextLong();
        long a=x+y;
        long b =x-y;
        long c =x*y;
        switch (sign){
            case "+":
                if(a==z){
                    System.out.println("Yes");
                    break;
            }else{
                    System.out.println(a);
                }
                break;

            case "-":
                if(b==z){
                    System.out.println("Yes");
                    break;
                }else{
                    System.out.println(b);
                }
                break;
            case "*":
                if(c==z){
                    System.out.println("Yes");
                    break;
                }else{
                    System.out.println(c);
                }
                break;
        }

    }
}