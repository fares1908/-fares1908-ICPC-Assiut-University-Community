import java.util.Scanner;
/*
شرح ASCII Code

https://youtu.be/KueQcEpReN0


 */
public class _Capital_or_Small_or_Digit {
    public  static  void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        char d=in.next().charAt(0);
        if(d>64&&d<91){
            System.out.println("ALPHA");
            System.out.println("IS CAPITAL");
            
        } else if (d>96&&d<123) {
            System.out.println("ALPHA");
            System.out.println("IS SMALL");
            
        }else{
            System.out.println("IS DIGIT");
        }


    }
}