
import java.util.Scanner;

class stomogrmatic{
    public static void Generate(int n){
        int start= (int)Math.pow(10,n-1);
        int end= (int)Math.pow(10,n);
        for(int i=start;i<end;i++){
            String res="";
            String num=Integer.toString(i);
            for(int j=0;j<num.length();j++){
                if(num.charAt(j)=='0') res= '0'+res;
                if(num.charAt(j)=='1') res= '1'+res;
                if(num.charAt(j)=='6') res= '9'+res;
                if(num.charAt(j)=='8') res= '8'+res;
                if(num.charAt(j)=='9') res= '6'+res;
            }
            if(res.equals(num)){
                System.out.println(res+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Generate(a);
    }
}