

class linkedlist{
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
 public void deletefirst(){
    head=head.next;
  }

  public void deleteLast(){
    Node curr=head;
    while(curr.next.next!=null){
      curr=curr.next;
    }
    curr.next=null;
  }

  //To sort values in 
public static int Unique(int[] nums){
  //int n=1;
  /*if(n<arr.length){
    return 0;
  }*/
  int n=0;
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]!=nums[n]){
                return nums[i];
            }
            else{
                n++;
            }
            }
    return nums[i];

            }
    
  
  public static void main(String args[]){
    linkedlist list=new linkedlist();
    list.Printlist();
    list.Addfirst("is");
    list.Addfirst("this");
    list.Addfirst("hi");
    list.Addlast("5");
    list.Printlist();
    list.deleteLast();
    list.Printlist();
    int[] arr={4,2,1,2,3,3};
    System.err.println(Unique(arr));


    

    


  }
}