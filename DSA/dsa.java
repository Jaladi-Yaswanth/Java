
import java.util.ArrayList;


 /*class  dsa {
  public static void PrintArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+"");}}
  public static void main(String[] args) {
    int arr[]={7,8,3,1,2};
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-i-1;j++){
        if (arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;}
      }
    }
    PrintArray(arr);
          
  }
}
class dsa{
  public static void main(String args[]){
    int num=7;
    double num2=5.2;
    int num3= 0b101;//Binary
    int num4=0x101;//Hexadecimal
    int num5=1010_10;
    char c=5;
    char d='5';
    char  e= 'e';//error
    d++;
    e++;
    int  b=258;
    //int a=b;
    byte a =(byte)b;
    double g = 5.6;
    int h=(int)g;
     
    System.out.println("Hi "+num);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(a);
    System.out.println(h);
  }
}*//*
class dsa{
  public static void main ( String args[]){
    int arr[]={25,36,96,78,45};
    for ( int i=0;i<arr.length;i++){
      System.out.println("The element at "+i+ " is "+arr[i]);
    }
  }
}

class dsa{
  public static void main( String args[])
{
  int[] arr={25,7,45};
  for (int i=0;i<arr.length;i++){
  System.out.println("The elemnt at"+i+"is "+arr[i]);
  System.out.println("The "+arr[arr.length-1]);

  }
  
}}

//1D Array
class dsa{
  public static void main(String args[]){
    //int[] array_1  ={{22,5,7}};
    int[] array_1  ={(22),5,7};
   
   for (int i=0;i<array_1.length;i++){
  System.out.println("The elemnt at"+i+"is "+array_1[i]);
   System.out.println(array_1);
  }
}
}*/

//2D Array
/*class dsa{
  public static void main(String args[]){
    int array_2[][] =new int[3][4];*/

    /*array_2[0][0]=1;
    array_2[0][1]=2;
    array_2[0][2]=3;
    array_2[0][3]=4;
    array_2[1][0]=5;
    for (int i=0;i<3;i++){
      for (int j=0;j<4;j++){
        System.out.print(array_2[i][j]+" ");   }
         System.out.println();
    }*/
   /*
   for (int n[] : array_2){
    for (int m: n){
      System.out.print(m+" ");
    }
    System.out.println();
   }
  }
}*/
/*


//Linked-List
class dsa{
  Node head;
  class Node{
    String data;
    Node next;
    
    Node(String data){
      this.data=data;
      this.next=null;
    }
  }

  public void Addfirst(String data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    newnode.next=head;
    head=newnode;
  }

  

  public void  Addlast(String data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    Node curr=head;
    while(curr.next!=null){
    curr=curr.next;
    }
    curr.next=newnode;}

  public void  Printlist(){
    if (head==null){
      System.out.println("List is empty");
      return;
    }
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.data+"->");
      curr=curr.next;
    }
    System.out.println("Null");
  }


    
  
  public static void main(String args[]){
    dsa list=new dsa();
    list.Printlist();
    list.Addfirst("is");
    list.Addfirst("this");
    list.Addfirst("hi");
    list.Addlast("5");
    list.Printlist();

  }
}*/

/*
import java.util.*;
class dsa{
  Node head;
  class Node{
    String data;
    Node next;
    
    public Node(String data){
      this.data=data;
      this.next=null;
    }
  }
  public void Addfirst(String data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    newnode.next=head;
    head=newnode;
  }
  public String  getinput(){
    Scanner os = new Scanner(System.in);
    System.out.print("Enter data: ");
    return os.nextLine();
  }
  public void  Printlist(){
    if (head==null){
      System.out.println("List is empty");
      return;
    }
    Node curr=head;
    while(curr!=null){
      System.out.print(curr.data+"->");
      curr=curr.next;
    }
    System.out.println("Null");
  }


public static void main(String args[]){
  dsa list=new dsa();
  String data=list.getinput();
  list.Addfirst(data);
  list.Addfirst(data);

  list.Printlist();
}
}
*/


/*
class dsa{
  Node head;
  class Node{
    Node next;
    String data;
    public Node(String data){
      this.data=data;
      this.next=null;
    }
  }
  public void Addfirst(String data){
    Node newnode=new Node(data);
    if(head==null){
      head=newnode;
      return;
    }
    newnode.next=head;
    head=newnode;
  }

  public void Printlist(){
    Node curr= head;
    while(curr!=null){
      System.out.print(curr.data+"->");
      curr=curr.next;
    }
    System.out.println("NULL");
  }

  public void deletefirst(){
    head=head.next;
  }

  public void deleteLast(){
    Node curr=head;
    while(curr.next.next.next!=null){
      curr=curr.next;
    }
    curr.next.next=null;
  }

public static void main(String args[]){
  dsa list=new dsa();
  list.Addfirst("10");
  list.Addfirst("am");
  list.Addfirst("I");
  list.Addfirst("hi");
  list.deletefirst();
  list.deleteLast();
  list.Printlist();
}
  
}
*/
/*
import java.util.*;
class dsa{
  public static void main(String args[]){
    LinkedList<String> list=new LinkedList<String>();
    list.add("hi");
    list.add("this");
    System.out.println(list);
    for(int i=0;i<list.size();i++){
      System.out.print(list.get(i)+"->");
    }
    System.out.println("NULL");
    //String first=list.peek();
  System.out.println(list.peek());
  }
  
}*/

//Patt

class dsa{
  public static void main(String[] args) {
      int[] arr={1,2,3,4};
      int[] arr2={1,2,3,4};
      ArrayList<Integer> num= new ArrayList<>();
      num.add(1);
      num.add(2);
      num.add(3);
      num.add(4);

      ArrayList<Integer> num2= new ArrayList<>();
      num2.add(1);
      num2.add(2);
      num2.add(3);
      num2.add(4);


      
   
  }
}


