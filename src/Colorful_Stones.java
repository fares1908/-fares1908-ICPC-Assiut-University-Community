import java.util.Scanner;

public class Colorful_Stones {
    public  static  void main(String args [])
    {
        Scanner in=new Scanner(System.in);
        String x= in.next();
        String y=in.next();
        int counter=1;//الكونتر و الزد بيشاوروا علي الاكس
        int z=0;
        for (int i=0;i<y.length();i++){
            if(x.toCharArray()[z]==y.toCharArray()[i]){ //هنا استخدمت توشار ارري عشان اعرض الاسرينج ع شكل صفوف جمب بعض
                counter++;
                z++;
            }
        }
        System.out.println(counter);
    }
}
