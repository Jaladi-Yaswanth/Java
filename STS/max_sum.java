import java.util.*;
class max_sum{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int col =sc.nextInt();
    int row =sc.nextInt();
    int[][] nums=new int[col][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            nums[i][j]=sc.nextInt();
        }
    }
     for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(nums[i][j]+ " ");
        }
        System.err.println();
    }

    System.out.println();

    int max=0,sum=0;
    for(int i=0;i<row-2;i++){
        for(int j=0;j<col-2;j++){
            sum=nums[i][j]+nums[i][j+1]+nums[i][j+2]+nums[i+1][j+1]+nums[i+2][j]+nums[i+2][j+1]+nums[i+2][j+2];
            max=Math.max(sum,max);
        }
    }
    System.err.println(max);
    }

   

    }
    

