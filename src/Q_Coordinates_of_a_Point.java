import java.util.Scanner;

public class Q_Coordinates_of_a_Point {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if(x>0&&y>0){
            System.out.println("Q1");
        } else if (x<0&&y>0) {
            System.out.println("Q2");
        } else if (x<0&&y<0) {
            System.out.println("Q3");

        }
        else if (x==0 &&y ==0){
            System.out.println("Origem");

        }
        else if (x==0){
            System.out.println("Eixo Y");

        }else if (y==0){
            System.out.println("Eixo X");

        }

        else {
            System.out.println("Q4");
        }
    }
}