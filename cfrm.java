import java.io.FileReader;   
class cfrm   {  
    public static void main(String[] args) {  
        try {  
            
            FileReader f1 = new FileReader("k1.txt"); 
            int i=0;    
            while((i=f1.read())!=-1){    
             System.out.print((char)i);    
              
            }  
            f1.close();
        } catch (Exception exception) {  
            System.out.println("Unexcpected error occurred!");  
             
        }  
    }  
}  