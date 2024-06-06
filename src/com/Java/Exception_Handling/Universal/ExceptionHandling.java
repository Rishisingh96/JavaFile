package Exception;
import java.io.*;
import java.io.IOException;
public class ExceptionHandling  {
    public static void main(String args[]) {
       File f = new File("Rishicode.txt");
       
       try{
       f.createNewFile();
       }catch(IOException e){
           System.out.println("File Error");
       }
    }
}
