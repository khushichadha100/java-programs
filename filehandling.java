import java.io.*;  
public class filehandling {  
    public static void main(String[] args) {  
  
        
            File file = new File("javaFile123.txt");  
            if (file.exists()) {  
                System.out.println("Name of file: " +file.getName());  
                System.out.println("file path :"+ file.getAbsolutePath()); 
          System.out.println("can file write? :" +file.canWrite()); 
     System.out.println("can file read? :" +file.canRead()); 
   System.out.println("file size in bytes :" +file.length()); 
         }  
         else{
                System.out.println("File not exists.");  }
        
        
         
    }  
} 