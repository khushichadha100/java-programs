import java.io.FileInputStream;  
public class frm
{  
     public static void main(String args[])
    {    
       try
       {    
          FileInputStream fin=new FileInputStream("k1.txt");    
            int i=0;    
            while((i=fin.read())!=-1)
           {    
             System.out.print((char)i);   
            }
          fin.close();    
         }
        catch(Exception e){System.out.println(e);}    
      }    
}