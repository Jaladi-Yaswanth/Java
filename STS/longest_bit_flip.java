class longest_bit_flip{
    public static void main(String[] args) {
        int a= 183;
        String num=Integer.toBinaryString(a);
        System.err.println(num);
        int count=0;
        while(a>0){
            if((a&1)==1) count++;
            a>>=1;
        }
        System.err.println(count);

        int[] nums=new int[]{1,0,1,0,0,0};
        int count_1=0;
        for(int i : nums){
            if(i==1) count_1++;
        }
    System.err.println(count_1);
    }
}