import java.util.Scanner;

public class O_Calculator {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        char s =' ';
        int p =0;
        for(int i=0 ; i<x.length();i++){
            /*
            هنا هعمل فور عشان امر علي عناصر الاسترينج وهعمل ايف ان وانا بمر علي عناصر الاستريج اشوف لو في حاجه بتساوي الاشارات هجطها في ال s
        */
            if(x.charAt(i)=='+' ||x.charAt(i)=='-' ||x.charAt(i)=='*' ||x.charAt(i)=='/'){
                s=x.charAt(i);
                p=i;
                break;
            }

        }
        switch (s){
            /*
        انا هنا مدخل رقمين وعامل عليهم عمليه حسابيه فهقسم الرقم اللي انا مدخله مبدئيا هعمل انتيجر بارث عشان احوله لانتيجر
        جيه دور ان اقسمه ههحدد رقم من الانديكس صفر الي الانديكس اللي قبل العلامه p وتاني رقيم هيكون من بعد العلامهp+1 لحد الاخر
        */
            case '+':
                System.out.println(Integer.parseInt(x.substring(0,p))+Integer.parseInt(x.substring(p+1)));
             break;
            case '-':
                System.out.println(Integer.parseInt(x.substring(0,p))-Integer.parseInt(x.substring(p+1)));
                break;
            case '*':
                System.out.println(Integer.parseInt(x.substring(0,p))* Integer.parseInt(x.substring(p+1)));
                break;
            case '/':
                System.out.println(Integer.parseInt(x.substring(0,p))/Integer.parseInt(x.substring(p+1)));
                break;
        }


        }
    }