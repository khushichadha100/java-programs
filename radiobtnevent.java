import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
class MyFrame extends JFrame implements ActionListener 
{ 
JRadioButton jrb,jrb1,jrb2; 
JLabel jl; 
MyFrame() 
{ 
setLayout(new FlowLayout()); 
jl=new JLabel(); 
jrb=new JRadioButton("I"); 
jrb1=new JRadioButton("ME"); 
jrb2=new JRadioButton("MYSELF" ); 
add(jrb); add(jrb1); add(jrb2); add(jl); 
ButtonGroup bg=new ButtonGroup(); 
bg.add(jrb); bg.add(jrb1); bg.add(jrb2);
jrb.setSelected(true);
jrb.addActionListener(this); 
jrb1.addActionListener(this); 
jrb2.addActionListener(this); 
} 
public void actionPerformed(ActionEvent ae) 
{ 
jl.setText("You Selected :"+ae.getActionCommand()); 
} 
} 
class radiobtnevent
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
