import java.util.Scanner;

/**
 *
 * @author fares
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in =new Scanner (System.in);
        double r= in.nextDouble();
        double pi= 3.141592653;
        double area=pi*r*r;
        System.out.println(area);

    }
}