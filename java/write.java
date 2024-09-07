import java.io.*;

public class write{
public static void main(String[] args){
File file=new File("22bce9789.txt");
    try{
        FileWriter writer=new FileWriter("22bce9789.txt");
        writer.write("This is how we can write ");
        writer.close();
        System.out.println("File written Successfully.");
        }
catch (IOException e) {
    System.out.println("Error create file: "+e.getMessage());
                        }
}
}