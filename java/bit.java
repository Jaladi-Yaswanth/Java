
import java.util.Arrays;

class bit{

    public static int  Unique(int[] arr){
        int ans=0;

        for(int n:arr) {
            ans^=n;
         }
     return ans;
    }
    //To find ith bit of anumber
    public static int I_bit(int num,int n){
        int mask=num>>(n-1);
        return num&mask;
        

    }
    
    public static int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
        int count=0;
        int j=i;
            while(i!=0){
                i>>=1;
                count+=j&1;
            }
            arr[i]=count;
        }
    return arr;
    }
    
    public static void main(String args[]){
        /*int n=10;
        System.err.println(n^1);
        System.err.println(n^0);
        int[] list={2,2,3,4,6,4,6,8,11};
        System.out.println(I_bit(13, 3));
    
        System.out.println(Unique(list));*/
        int[] ans=countBits(5);
        System.out.println(Arrays.toString(ans));


    }

}