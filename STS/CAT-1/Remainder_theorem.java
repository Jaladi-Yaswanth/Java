
import java.util.Scanner;

class Remainder_theorem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int[] div= new int[size];
        int[] rem= new int[size];
        for(int i=0;i<size;i++){
            div[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            rem[i]=sc.nextInt();
        }

        int x=1,c=0;
        while(true){
        for(int i=0;i<size;i++){
            if(x%div[i]==rem[i]) c++;
        }
        if(c==size){
            System.err.println(x);
            return;
        }
        x++;
        c=0;

        }


    }
    
}