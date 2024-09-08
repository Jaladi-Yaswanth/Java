
import java.util.Arrays;


 //Create a class
    class Student{
        int  roll_no;
        String name;
        float  marks;
        boolean pass;
 
        static boolean paid_fess=true;
        //Constructor
        //even if you did not create the constructor,Java provides a 
        //default no-argument constructor if no constructors 
        //are explicitly defined by the programmer.
        /*Student(int roll_no,String name,float marks,boolean pass){
            this.roll_no=roll_no;
            this.name=name;
            this.marks=marks;
            this.pass=pass;
        }*/

    }

class oops{

   
    public static void main(String args[]){
         /* 
        //store 5 roll numbers;
        int[] roll=new int[5]; 

        //store 5 name numbers   
        String[] name= new String[5]; 
        */
        Student[] students=new Student[5];
        System.out.println(Arrays.toString(students));

        int[] i=new int[5];
        System.out.println(Arrays.toString(i)); //[0, 0, 0, 0, 0]
        String[] S=new String[5];
        System.out.println(Arrays.toString(S)); //[null, null, null, null, null]
        float[] f=new float[5];
        System.out.println(Arrays.toString(f)); //[0.0, 0.0, 0.0, 0.0, 0.0]
        char[] c=new char[5];
        System.out.println(Arrays.toString(c)); //[, , , , ]
       
       //Just declaring
        Student yash=new Student();
        //Before assigning values
        System.out.println(yash);  
        System.out.println(yash.roll_no); // 0 
        System.out.println(yash.name);  // null
        System.out.println(yash.marks); // 0.0 
        System.out.println(yash.pass);  //false

        //Assigning values
        yash.roll_no= 9789;
        yash.name= "Yaswanth";
        yash.marks= 96.5f;
       // yash.salary=5500;   //error since not declared
        yash.pass=  (yash.marks> 60.f)? true: false;
        System.out.println(yash.name); //Yaswanth
        System.out.println(yash.roll_no); //9789
        System.out.println(yash.marks);  // 96.5
        System.out.println(yash.pass);   //true
        //System.err.println(yash.salary); //error
  
       //Constructors--Asssigning ||Allocation during creation itself
       // if you have 100 properties,instead of assigning multiple times,we can assign in single line during creation
       System.out.println(yash.paid_fess);   //true






}
}