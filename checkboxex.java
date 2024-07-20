import javax.swing.*;  
import java.awt.*;
public class checkboxex  
{  
      checkboxex(){  
        JFrame f= new JFrame("CheckBox Example");  
         ImageIcon ii=new ImageIcon("btn1.JPG");
        JCheckBox checkBox1 = new JCheckBox("button",ii,true);  
         
        
         f.setLayout(new FlowLayout());
        f.add(checkBox1);  
         
        f.setSize(400,400);  
         
        f.setVisible(true);  
     }  
public static void main(String args[])  
    {  
    new  checkboxex();  
    }} 