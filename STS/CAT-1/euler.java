class euler{
    public static int gcd(int a,int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
    return b;
    }
    public static void main(String[] args) {
        int res=gcd(12,30);
        System.err.println(res);
    }
}