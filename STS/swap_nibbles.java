import java.util.*;
class swap_nibbles{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        String str_num=Integer.toBinaryString(num);
        while(str_num.length()<8) {
            str_num="0"+str_num;
        }
        String result=str_num.substring(str_num.length()/2)+str_num.substring(0,str_num.length()/2);
        System.err.println("Orginal numbers is : "+ num);
        System.err.println("Orginal numbers to string(bytes) : "+ str_num);
        System.err.println("Swapped string bytes is : "+ result);
        System.out.println("Swapped numbers is : "+ Integer.parseInt(result,2));

    }
}