import java.util.Scanner;

public class Night_at_the_Museum {
    public static  void main(String args []){
        Scanner in =new Scanner(System.in);
        int Start= 97;
        int mov=0;
        String value= in.next();
        for (int i=0 ; i<value.length();i++){
            int result=Math.abs(value.toCharArray()[i]-Start);//مكتبه الماث عشان تعفيني من ان يظهر رقم سالب
            if(result<=13){
                mov+=result;

            }
            else{
                mov+=(26-result);
            }
            Start=value.toCharArray()[i];
        }
        System.out.println(mov);
    }
}
