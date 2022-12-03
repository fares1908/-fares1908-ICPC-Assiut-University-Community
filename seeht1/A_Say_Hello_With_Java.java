import java.util.Scanner;

public class Say_Hello_With_Java {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        System.out.print("Hello, ");
        System.out.print(x);
    }
}