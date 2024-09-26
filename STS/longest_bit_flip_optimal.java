import java.util.*;

public class longest_bit_flip_optimal{
    
    

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String  nums=Integer.toBinaryString(sc.nextInt());
        int cl=0,pl=0,ml=0;
        for(int i =0;i<nums.length();i++){
            if(nums.charAt(i)=='1') cl++;
            else {
                ml=Math.max(ml,cl+pl+1);
                pl=cl;
                cl=0;
            }
            
        }
        ml=Math.max(ml,cl+pl+1);
        
      System.out.println(ml);  
    }
}