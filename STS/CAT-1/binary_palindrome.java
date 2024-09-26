
import java.util.Scanner;


class binary_palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String a="";
        String b="";
        while(n>0){
            a=a+n%2;
            b=n%2+b;
            n/=2;
        }
        if(a.equals(b)){
            System.err.println("yes");
        }
        else  System.err.println("No");

    }
}