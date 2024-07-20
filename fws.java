import java.io.FileOutputStream;  
public class fws {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("k1.txt");    
             String s="i love java";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}
