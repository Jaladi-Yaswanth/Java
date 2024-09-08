import java.util.*;
class Maze{
public static int Maze(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=Maze(r-1,c);
        int right=Maze(r,c-1);
        return left+right;
    }

    public static int Maze_2(int r,int c){
        if(r==4 || c==5){
            return 1;
        }
        int left=Maze_2(r+1,c);
        int right=Maze_2(r,c+1);
        return left+right;
    }

     public static int Maze_3(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int diagonal=Maze_3(r-1,c-1);
        int left=Maze_3(r-1,c);
        int right=Maze_3(r,c-1);
        return left+right+diagonal;
    }


    static  void Path_Maze(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return ;
        }
        if(r>1){
            Path_Maze(p+"D", r-1, c);
        }
        if(c>1){
            Path_Maze(p+"R", r, c-1);
        }
    }

    static  void Path_Maze_2(String p,int r,int c){
        if(r==4 && c==5){
            System.out.println(p);
            return ;
        }
        if(r<=4){
            Path_Maze_2(p+"D", r+1, c);

        }
        if(c<=5){
            Path_Maze_2(p+"R", r, c+1);
            
        }
    }



   public static void Path_Maze_input(String p,int r,int c,int row,int col){
     
    if(r==row && c==col){
                System.out.println(p);
                return ;
            }
            if(r<=row){
                Path_Maze_input(p+"D", r+1, c,row,col);
            }
            if(c<=col){
                Path_Maze_input(p+"R", r, c+1,row,col);
            }
    }


    public static void Path_Maze_input_2(String p,int r,int c,int row,int col){
     
    if(r==row && c==col){
                System.out.println(p);
                return ;
            }
            if(r<=row){
                Path_Maze_input_2(p+"D", r+1, c,row,col);
                Path_Maze_input_2(p+"U", r-1, c,row,col);
            }
            if(c<=col){
                Path_Maze_input_2(p+"R", r, c+1,row,col);
                Path_Maze_input_2(p+"L", r, c-1,row,col);
            }
    }

    public static  ArrayList<String> PathMaze(String p,int r ,int c,int row,int col,int r_des,int c_des){
        if(r==r_des  && c==c_des){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
            ArrayList<String> list= new ArrayList<>();
        
        if(r<row){
            list.addAll(PathMaze(p+"D", r+1, c, row, col,r_des,c_des));
        }
         if(c<col){
            list.addAll(PathMaze(p+"R", r, c+1, row, col,r_des,c_des));
        }
        return list;
    } 

    /*public static ArrayList<String> PathMaze_with_Restrictions(String p,boolean [][] arr,int r ,int c,int row,int col,int r_des,int c_des){
        if(r==r_des  && c==c_des){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(arr[r][c]==true){
         if(r<row){
            list.addAll(PathMaze_with_Restrictions(p+"D",arr, r+1, c, row, col,r_des,c_des));
        }
         if(c<col){
            list.addAll(PathMaze_with_Restrictions(p+"R",arr, r, c+1, row, col,r_des,c_des));
        }
        }


        return list;
    } */

   /*public static  ArrayList<String> PathMaze_with_all(String p,boolean[][] arr,int r ,int c,int row,int col,int r_des,int c_des){
        if(r==r_des  && c==c_des){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
            ArrayList<String> list= new ArrayList<>();
           arr[r][c]=false;
        
        if(r<row){
            list.addAll(PathMaze_with_all(p+"D",arr, r+1, c, row, col,r_des,c_des));
        }
        if(r>0){
            list.addAll(PathMaze_with_all(p+"U",arr, r-1, c, row, col,r_des,c_des));

        }
         if(c<col){
            list.addAll(PathMaze_with_all(p+"R",arr, r, c+1, row, col,r_des,c_des));
        }
        if(c>0){
            list.addAll(PathMaze_with_all(p+"L",arr, r, c-1, row, col,r_des,c_des));
        }
        arr[r][c]=true;

        return list;
    } 
    */
   /*
    public static void  PathMaze_with_all(String p,boolean[][] arr,int r ,int c,int row,int col,int r_des,int c_des){
        if(r==r_des  && c==c_des){
            System.err.println(p);
            return ;
        }
        if(!arr[r][c]){
            return;
        }
            
           arr[r][c]=false;
        
        if(r<=row){
            PathMaze_with_all(p+"D",arr, r+1, c, row, col,r_des,c_des);
        }
        if(r>0){
            PathMaze_with_all(p+"U",arr, r-1, c, row, col,r_des,c_des);

        }
         if(c<=col){
            PathMaze_with_all(p+"R",arr, r, c+1, row, col,r_des,c_des);
        }
        if(c>0){
            PathMaze_with_all(p+"L",arr, r, c-1, row, col,r_des,c_des);
        }
        arr[r][c]=true;

        
    } */
    public static void PathMaze_with_all(String p, boolean[][] arr, int r, int c, int row, int col, int r_des, int c_des) {
    if (r == r_des && c == c_des) {
        System.err.println(p);
        return;
    }

    

    arr[r][c] = false; // Mark current cell as visited

    if (r <= row) {
        PathMaze_with_all(p + "D", arr, r + 1, c, row, col, r_des, c_des);
    }
  
    if (c <= col) {
        PathMaze_with_all(p + "R", arr, r, c + 1, row, col, r_des, c_des);
    }
    if (r > 0) {
        PathMaze_with_all(p + "U", arr, r - 1, c, row, col, r_des, c_des);
    }
    if (c > 0) {
        PathMaze_with_all(p + "L", arr, r, c - 1, row, col, r_des, c_des);
    }

    arr[r][c] = true; // Unmark current cell after exploring
}

public static void main(String[] args) {
    System.out.println(Maze(4,3));
       Scanner sc =new Scanner(System.in); 
        System.out.print("No of rows in Matrix :");
         int row=sc.nextInt();
        System.out.print("No of columns in Matrix :");
        int col=sc.nextInt();
        Search obj=new Search();
        //System.out.println(Search.Path_Maze_input("", 0, 0, row, col));
        //Path_Maze("", 3, 3);
        Path_Maze_2("", 1, 1);
        System.err.println(Maze(4, 5));
        //Path_Maze_input_2("", 2, 3, 4, 5);
        //System.err.println(Maze_3(3, 3));
        /*Scanner sc =new Scanner(System.in);
         System.out.print("No of rows in Matrix :");
         int row=sc.nextInt();
        System.out.print("No of columns in Matrix :");
        int col=sc.nextInt();
        System.out.print("destination row :");
         int r_des=sc.nextInt();
        System.out.print("destination col :");
        int c_des=sc.nextInt();*/
        /*boolean[][] maze = {
    {true, true, true, true, true},
    {true, true, true, true, true},
    {true, true, true, true, true},
    {true, true, true, true, true},
    {true, true, true, true, true}};
    Scanner sc =new Scanner(System.in);
 System.out.println("No of rows in Matrix :");
    int row = sc.nextInt();

    System.out.println("No of columns in Matrix :");
    int col = sc.nextInt();

    System.out.println("destination row :");
    int r_des = sc.nextInt() - 1; // Adjust for zero-based indexing

    System.out.println("destination col :");
    int c_des = sc.nextInt() - 1; // Adjust for zero-based indexing

    // Initialize arr with appropriate dimensions (replace with your maze data)
    boolean[][] arr = new boolean[row][col];

    PathMaze_with_all("", arr, 0, 0, row - 1, col - 1, r_des, c_des);
*/
}
         


        
}