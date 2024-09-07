
class Search{
    //LinearSearch
    static  int  LinearSearch(int arr[], int target ){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        
        }
        return -1;
    }

  

    public void LinearSearch2(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i);
            }
        }

    }

    static int min(int [] arr){
        int smallest= arr[1];
        for(int i=0;i<arr.length;i++){
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
            return smallest;

    }

    static int[] search2D(int [][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;i++){
                if (arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

   
    //BinarySearch
    static int BinarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    //Search if we don't know assc or desc
    static int BinarySearch2(int [] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(start>end){
            int mid=start+(end-start)/2;
            if (mid==target){
                return mid;
            }
            if(mid<start){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        else{
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
         return -1;
    }

    static int[] BinarySearch_in_2D_Array_Sorted(int[][] arr,int target){
        int i=0;
        int col=arr[0].length-1;
        while(i<arr.length && col>=0){
             
            if(arr[i][col]==target) {
                return new int[]{i,col};
            } else if(arr[i][col] <target){
                i++;
            }
            else {
                col--;
            }
        }
    return new int[]{-1,-1} ;
    }
    
    //Insertion Sort 
    public static int[]  Insertion_Sort(int[] arr){
        int temp;
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;

                }
                else break;
            }
        }
        return arr;
    }
    
    //Cyclic Sort
    public static int[] CyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct]!=arr[i]){
             int temp=arr[i];
             arr[i]=arr[correct];
             arr[correct]=temp;
            }
            else i++;
        }
       return arr;
    }

    public void  Numbers(int n){
        if(n==0){
          return ;
        }
       

        Numbers(n-1);
         System.out.print(n+" ");
        //System.out.println(n);
    } 

    


    

    public static void main(String args[]){
        /*int nums1[]={1,2,5,8,9,5,8,5,7,-6};
        int target=10;
        int ans=LinearSearch(nums,target);
        System.out.println(ans);
        Search obj=new Search();
        obj.LinearSearch2(nums,target);
        System.out.println(min(nums));
        int nums[][]={{100,15},{85,78,63},{45,68,74,52},{10}};
        int[] ans=search2D(nums,target);
        System.out.println(Arrays.toString(ans));
        int [] binnums={7,52,85,96,120,301};
        int targetbin=22;
        int[] binnum2_desc={120,45,22,0,-3};
        System.out.println("The target is found at index "+ BinarySearch2(binnum2,targetbin));
        int target_bin=30;
        int nums_bin[][]={{10,20,30,40},{25,26,36,41},{27,28,38,45},{29,30,39,50}};
        int[] ans_bin=BinarySearch_in_2D_Array_Sorted(nums_bin, target_bin);
        System.out.println(Arrays.toString(ans_bin));
        int[] nums={-56,25,1,2,9};
        Insertion_Sort(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums={5,4,3,2,1};
        CyclicSort(nums);
        System.out.println(Arrays.toString(nums));
        Search obj=new Search();
        obj.Numbers(10);*/
        String str= new String(" Yaswanth");
        System.out.println(str.substring(2));
        System.out.println(str);

        

    }
}