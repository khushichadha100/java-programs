import java.io.FileWriter;   
class cfwi {  
    public static void main(String[] args) {  
      
    try {  
        FileWriter fwrite = new FileWriter("k1.txt");  
        fwrite.write("90");   
        fwrite.close();   
        System.out.println("Content is successfully wrote to the file.");  
    } catch (Exception e) {  
        System.out.println("Unexpected error occurred");  
        
        }  
    }  
}  