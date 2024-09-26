class stomogramatic{
    public static void main(String[] args) {
        /*int n=2;
        int start=(int) Math.pow(10,n-1);
        int end=(int) Math.pow(10,n);
        for(int i=start;i<end;i++){
            String s="";
            String s1=Integer.toString(i);
            for(int j=0;j<s1.length();j++){
                char c=s1.charAt(i);
                if(c=='0') s="0"+s;
                if(c=='1') s="1"+s;
                if(c=='6') s="9"+s;
                if(c=='8') s="8"+s;
                if(c=='9') s="6"+s;
            }
            if(s1.equals(s)){
                System.err.println(s1+" ");
            }

        }*/
       int a=10;
       int b=20;
       System.out.println(a++*--a/++b*--a);
       //System.out.println(a++);
       /*System.out.println(--a);
       System.out.println(++b*--a);
*/


    }

}