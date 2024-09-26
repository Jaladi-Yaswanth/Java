
import java.util.Arrays;
import java.util.Scanner;



class Rotation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size=5;
        int[] nums=new int[size];
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        int[] rotated=new int[nums.length];
        int j=2;
        int k=j%nums.length;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            rotated[(i+k)%n]=nums[i];
        }
        System.err.println(Arrays.toString(rotated));
    }
}


/*class Rotation{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        int[] rotated=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int n=nums.length;
        int k=sc.nextInt();
        k=k%n;
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%n]=nums[i];
        }
        System.err.println(Arrays.toString(nums));
    }
}*/
/*
import java.util.*;

public class Rotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] nums=new int[size];
        int k=sc.nextInt();
        
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        
        int n=nums.length;
        int[] rotated=new int[n];

        k= (k%n+n)%n ;
        for(int i=0;i<size;i++){
            rotated[(i+k)%n]=nums[i];
        }
           System.out.println(Arrays.toString(rotated));
        
    }
}*/