
import java.util.Arrays;

class sol{
    public static void main(String[] args) {
        int[] num=new int[]{5,4,3,8,5,9};
        int[] nums=new int[num.length];
        int count=0;
     int t=5;
     for(int i=0;i<num.length;i++){
        if(num[i]!=t){
            nums[count]=num[i];
            count++;
        }
     }
    System.err.println(count);
    System.out.println(Arrays.toString(nums));
   // nums=Arrays.copyOf(nums);
   // System.err.println(Arrays.toString(nums));
    }
}