import java.io.FileOutputStream;  
public class fwi {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("k1.txt");       
             fout.write(90);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}