import java.io.File; 
import java.util.Scanner; 
public class FileReader 
{ 
  public static void main(String[] args) throws Exception 
  {  
    File file =new File("C:\\Users\\get it\\Desktop\\java work\\Dynamic Data Storage\\abc.txt"); 
    Scanner scan = new Scanner(file); 
    while (scan.hasNextLine()) 
    System.out.println(scan.nextLine()); 
   
}
}