
import java.util.Scanner;

class swap_nibbles_optimal{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int a= num%16;
        int b=num/16;
        System.err.println(a*16+b);
            }
}