import java.util.Scanner;

public class n_Char {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char d = in.next().charAt(0);
        if(d>64&&d<91){
            d+=32;
        }else {
            d-=32;
        }
        System.out.println(d);
    }
}