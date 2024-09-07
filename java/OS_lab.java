import java.io.*;

public class OS_lab{
  public static void main(String[] args) {
File file=new File("22bce9789.txt");

try{


if(file.createNewFile()){
      System.out.println("File created: "+file.getName());
}
else{

System.out.println("File already exists");

}

}catch(IOException e){

System.out.println("Error create file:"+e.getMessage());

}
}
}