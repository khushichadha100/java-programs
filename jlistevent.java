import javax.swing.*; 
import javax.swing.event.*; 
import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends JFrame implements ListSelectionListener 
{ 
JLabel jl; 
JList j; 
MyFrame() 
{ 
setLayout(new FlowLayout()); 
jl=new JLabel("Choose one college.."); 
String arr[]={"BEC", "PVPSIT","RVR&JC", "VRSEC"}; 
j=new JList(arr); 
add(jl); 
add(j); 
j.setToolTipText("I am PVPSIT"); 
j.addListSelectionListener(this); 
} 
public void valueChanged(ListSelectionEvent le) 
{ 
JOptionPane.showMessageDialog(null, j.getSelectedValue()); 
} 
} 
class jlistevent
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