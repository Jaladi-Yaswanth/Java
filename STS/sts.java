
import java.util.Arrays;
import java.util.Scanner;


class sts{

    public static int Min(int [] arr,int[] arr2){
       for(int i=1;i<100;i++){
        for(int j=0;j<arr.length;j++){
            if(arr2[j]==i%arr[j]){
                return i;
            }
        }
       }
    return 0;
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter size");
        int size= sc.nextInt();
        System.err.println("Enter div array");

        int [] divisor=new int[size];
        for(int i=0;i<divisor.length;i++){
            System.err.println("enter elements in div");
            int a=sc.nextInt();
            divisor[i]=a;
        }

        int [] remainder=new int[size];
        System.err.println("Enter rem array");

        for(int i=0;i<remainder.length;i++){
            System.err.println("enter elements in remainder");
            int a=sc.nextInt();
            remainder[i]=a;
        }
        System.out.println(Arrays.toString(divisor));

        System.out.println(Arrays.toString(remainder));
        /*int res=Min(divisor,remainder);
        System.err.println(res);*/
         int x=1,c=0;
    while(true){
        for(int i=0;i<size;i++){
            if(x%divisor[i]==remainder[i]) c++;
        }
        if(c==size){
            System.out.println(x);
            return;

        }
        x++;
        c=0;
    }


    }
}