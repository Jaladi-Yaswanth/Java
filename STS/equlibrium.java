import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]=new int[(int)Math.pow(10,5)];
        int s=0;
        while(sc.hasNext()){
            nums[s]=sc.nextInt();
            s++;
        }
        int max=0;
        int left=0;
       int right= s-1;
       int left_count=0;
       int right_count=0;/*
    while(left<=right){
        left_count+=nums[left];
        right_count+=nums[right];
        if(left_count==right_count) max=Math.max(max,left_count);
        left++;
        right--;
    }
    System.out.println(max);*/
    for(int i=0;i<nums.length;i++){
            left_count+=nums[i];
            while(left!=right){
                right_count+=nums[right];
                right--;
            }
        if(left_count==right_count) max=Math.max(max,left_count);

            
            
    }
    System.err.println(max);
    }
}