
import java.util.Arrays;

class sequence{
    public static void main(String args[]){
        int n=10;
        int[] res =new int[10];
        res[0]=0;
        res[1]=2;
        int curr_add=6;
        for(int i=2;i<n;i++){
            res[i]=res[i-1]+curr_add;
            if(i%2!=0){
                curr_add+=4;
            }
        }
        System.err.println(Arrays.toString(res));
    }
}