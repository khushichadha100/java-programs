import javax.swing.*; 
import java.awt.*; 
//import java.awt.event.*;
class MyFrame  extends JFrame
{
JButton jb,jb1,jb2; 
JLabel jl; 
 
MyFrame()
{
 setLayout(new FlowLayout()); 
jl=new JLabel("click the button");
  JButton jb= new JButton("button 1");
  jb.setIcon(new ImageIcon("btn1.JPG"));
   jb.setHorizontalTextPosition(JLabel.CENTER);
 
        
add(jb); 
 
add(jl);
//jb.addActionListener(this); 
 
 
}
/*public void actionPerformed(ActionEvent ae)
{
jl.setText("hello: "+ae.getActionCommand());
}*/
}
class btn
{
public static void main(String arg[])
{
 MyFrame f=new MyFrame(); 
 f.setTitle("Welcome to Swings"); 
f.setSize(500,500); 
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
}
