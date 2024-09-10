
class Eucli{
    public static int meth(int a,int b){
        while(a!=b){
            if(a>b)  a=a-b;
            else b=b-a;
        }
        return b;
    }
    public static void main(String args[]){
        int count=0;
        int n=10;
        for(int i=0;i<n;i++){
            if(meth(i,n)==1) count+=1;
        }
        System.out.println(count);

    }
}