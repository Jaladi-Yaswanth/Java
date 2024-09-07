import java.io.*;
public class Delete {
public static void main(String[] args){
    File file=new File("22bce9789.txt");
if(file.delete()){
        System.out.println("File deleted."+file.getName());
            }
else{
        System.out.println("File not found or unable to delete");
    }
}
}