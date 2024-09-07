import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Dsa_problems{
    //To print NUmbers from 1 to n
    public void Numbers(int n){
        if(n==0){
            return;
        }
        Numbers(n-1);
        System.out.print(n+" ");
    }

//To print numbers from n to1
    public  static void Numbers_n(int n){
        if(n==0){
            return;
        }
         System.out.print(n+" ");
        Numbers_n(n-1);
    }

    //To print even numbers from n
    public static void Even_Numbers(int n) {
        if(n==0){
            return;
        }
        if(n%2==0){
        Even_Numbers(n-2);
        System.out.print(n+" ");
        }
        else {
            Even_Numbers(n-1);
        }
    }

    //To print List from right to left

    public static void Print_list(List<Integer> list){
        if(list.isEmpty()){
            return;
        }
        System.err.println(list.get(0));
        Print_list(list.subList(1,list.size()));
        
    }

    public static void Min_max(int[] arr){
        int min=arr[0];
        int max=arr[arr.length-1];

    }

//Sub string equals
    public static boolean Equals(String main,String sub){
        if(main.isEmpty()){
            return false;
        }
        if(sub.isEmpty()){
            return true;
        }

        if(main.charAt(0)==sub.charAt(0)){
            return Equals(main.substring(1), sub.substring(1));
        }
        else{
            return Equals(main.substring(1), sub);
        }
    
    } 

    //to print sum of digits of number
    public static int Sum(int num){
      if(num==0){
        return 0;
      }
      else{
        return (num%10)+Sum( num/10);
      }

    }

    //To reverse a number
    public static int Reverse(int num){
        if(num==0){
            return 0;
        }
        return (num%10*10)+Reverse(num%10);
    }

    public static ArrayList<Integer> list_1(boolean[] arr){
       ArrayList<Integer> list=new ArrayList<Integer>(5);
      for(int i=0;i<arr.length;i++){
        if(arr[i]==true) {
            list.add(i);
        }
       }
    return list;
    }
    public static void main(String[] args) {
        Dsa_problems obj=new Dsa_problems();
        
       /* obj.Numbers(10);
        System.out.println("");
        Numbers_n(10);
        Even_Numbers(15);
        int[] a={10,20,30,40,50};
        List<Integer> list=new ArrayList<>();
        list.addAll(Array.asList(a));

       String main="Yaswanth";
       String sub="sa";
       System.err.println(Equals(main, sub));
       System.out.println(Sum(147));
       System.out.println(Reverse(147));*/
       boolean[] arr=new boolean[5];
       arr[0]=true;
       arr[1]=false;
       arr[2]=true;
       arr[3]=false;
       System.err.println(Arrays.toString(arr));
       System.err.println(list_1(arr));
       String s= "yaswanth";
       char[] c= s.toCharArray();
       System.err.println(Arrays.toString(c));
      Map<Character,Character> mapp=new HashMap<>();
      mapp.put('o','p');
      mapp.put('h','i');
      mapp.put('b','y');
      System.err.println(mapp);

      


      

        
    }
}