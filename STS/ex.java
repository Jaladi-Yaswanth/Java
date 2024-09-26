
import java.util.Arrays;

class ex {
    public static void main(String[] args) {
        int[] nums=new int[]{3,2,3,2};
        System.err.println(removeElement(nums,3));
        System.err.println(Arrays.toString(nums));
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
    return count;
    }
}