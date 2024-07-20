import java.io.FileReader;   
class cfrs   {  
    public static void main(String[] args) {  
        try {          
            FileReader f1 = new FileReader("k1.txt"); 
            int i=f1.read();    
             System.out.print((char)i);     
            f1.close();
        } catch (Exception exception) {  
            System.out.println("Unexcpected error occurred!");  
             
        }  
    }  
}