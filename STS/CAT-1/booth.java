
import java.util.Scanner;

class booth{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=0;
        int n=Integer.toBinaryString(b).length();
        for(int i=0;i<n;i++){
            int curr=(a&1);
            if(curr==1) prod+=b;
            b<<=1;
            a>>=1;
        }
        System.err.println(prod);
    }
}