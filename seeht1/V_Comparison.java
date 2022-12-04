import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class V_Comparison {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Long x = in.nextLong();
        String sign= in.next();
        Long y = in.nextLong();
//        if (sign.equals("=")&&x==y){
//            System.out.println("Right");
//            return;
//        }else {
//            System.out.println("Wrong");
//
//        }
//        if (sign.equals("<")&&x<y){
//            System.out.println("Right");
//        }else {
//            System.out.println("Wrong");
//            return;
//        }
//        if (sign.equals(">")&&x>y){
//            System.out.println("Right");
//        }else {
//            System.out.println("Wrong");
//            return;
//        }
        switch (sign){
            case "=":
                if (x==y){
                    System.out.println("Right");
                    return;
                }else {
                    System.out.println("Wrong");

                }
                break;
            case "<":
                if (x<y){
                    System.out.println("Right");
                    break;
                }else {
                    System.out.println("Wrong");
                    break;
                }
            case ">":
                if (x>y){
                    System.out.println("Right");
                    break;
                }else {
                    System.out.println("Wrong");
                    break;
                }

        }
    }
}