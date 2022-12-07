import java.util.Scanner;

public class D_Fixed_Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            int x= in.nextInt();
            if(x==1999){
                System.out.println("Correct");
                break;
            }else {
                System.out.println("Wrong");
            }
        }
    }
}
