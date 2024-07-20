import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
JButton jb,jb1,jb2; 
JLabel jl; 
MyFrame()
{
setLayout(new FlowLayout()); 
jl=new JLabel();
 ImageIcon ii3=new ImageIcon("btn3.JPG"); 
jb=new JButton("GREEN",ii3);
ImageIcon ii=new ImageIcon("btn1.JPG"); 
jb1=new JButton("PURPLE",ii);
ImageIcon ii2=new ImageIcon("btn2.JPG"); 
jb2=new JButton("PINK", ii2);

add(jb); add(jb1); add(jb2); add(jl);
jb.addActionListener(this); 
jb1.addActionListener(this); 
jb2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
 
jl.setText("You Pressed: "+ae.getActionCommand());
 
}
}
class jbtnlast
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
