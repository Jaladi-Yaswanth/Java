class example{
    //star 
    public void  Pattern1(int n){
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
       }
    }
    //number
    public void Pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void Pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public void Pattern4(int n){
        for(int i=0;i<(2*n);i++){
            int colinrow = i>n ? 2*n-i : i ;
            for(int j=0;j<colinrow;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern5(int n){
        for(int i=0;i<2*n;i++){
            int colinrow= n<i ? 2*n-i :i; 
           int noofspaces=n-colinrow;
           for(int s=0;s<=noofspaces;s++){
            System.out.print(" ");
           }
            for(int j=0;j<colinrow;j++){
                System.out.print("* ");
            }
                System.out.println();

        }
    }

    public void Pattern6(int n){
        for(int i=1;i<2*n;i++){
            int colinrow= n<i ? 2*n-i :i; 
           int noofspaces=n-colinrow;
           for(int s=0;s<=noofspaces;s++){
            System.out.print(" ");
           }
            for(int j=1;j<colinrow;j++){
                System.out.print(j+" ");
            }
                System.out.println();

        }
    }
    

    public void Pattern7(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
                System.out.println();

        }
    }

    public void Pattern8(int n){
        for(int i=1;i<2*n;i++){
            int colinrow= n<i ? 2*n-i :i;
            int spacesin= n- colinrow;
            for(int s=1;s<=spacesin;s++){
                System.out.print(" ");
            }
            for(int j=colinrow;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public void Pattern9(int n){
        for(int i=1;i<=2*n;i++){
            int colinrow= n<i ? 2*n-i :i;
            int spacesin= n- colinrow;
            for(int s=0;s<spacesin;s++){
                System.out.print("  ");
            }
            for(int j=colinrow;j>=1;j--){
                System.out.print(j+" ");
            }
            for(int c=2;c<=colinrow;c++){
                System.out.print(c+" ");
            }
            System.out.println();

        }
    }

    public void Pattern10(int n){
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int Ateveryindex= Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(Ateveryindex+" ");
            }
            System.out.println();
        }
    }
    public void Pattern11(int n){
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int Ateveryindex= Math.max(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(Ateveryindex+" ");
            }
            System.out.println();
        }
    }

    public void Pattern12(int n){
        int original=n;
        n=2*n;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                int Ateveryindex=original- Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(Ateveryindex+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        example li=new example();
       li.Pattern12(4);/*
       li.Pattern2(5);
       li.Pattern3(5);
       li.Pattern4(5);
       li.Pattern5(5);
       li.Pattern6(5);
       li.Pattern7(5);
       li.Pattern8(5);*/


       
    }
}