import java.util.Scanner;
public class MyBrother {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name0  = in.next();
        String name1  = in.next();
        String name3  = in.next();
        String name4= in.next();

        if(name1.equals(name4)){
            System.out.println("ARE Brothers");
        }
        else {
            System.out.println("NOT");
        }
    }

}