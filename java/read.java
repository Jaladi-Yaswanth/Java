import java.io.*;
import java.util.Scanner;

public class read{
public static void main(String[] args) {
  File file=new File("22bce9789.txt");
    try{
        Scanner scan=new Scanner(file);
    while(scan.hasNextLine()) {
            System.out.println(scan.nextLine());
                            }
scan.close();
}
    catch (FileNotFoundException e) {
        System.out.println("Error create file:"+e.getMessage());
                                    }
}
}