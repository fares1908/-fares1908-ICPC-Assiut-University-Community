import java.math.BigInteger;
import java.util.Scanner;

public class Y_The_last_2_digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BigInteger a =in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger c = in.nextBigInteger();
        BigInteger d = in.nextBigInteger();
        BigInteger x= a.multiply(b).multiply(c).multiply(d);
        BigInteger mod=new BigInteger("100");
        x=x.mod(mod);
        String s=x.toString();
        if(s.length()-1==0){
            System.out.println("0"+s);
        }else {
            System.out.println(s);
        }

    }
}
/*
import java.util.Scanner;

public class Y_The_last_2_digits {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        Long b = in.nextLong();
        Long c = in.nextLong();
        Long d = in.nextLong();
        Long x= a*b*c*d;

       String f=Long.toString((long) x);
        System.out.print(f.charAt(f.length()-2));
         System.out.print(f.charAt(f.length()-1));

    }
}

 */