import javax.swing.*;  //importing swing package
import javax.swing.*;  //importing swing package
import java.awt.*;     //importing awt package
public class jbtn
{
	JFrame jf;
	public jbtn() {
		jf = new JFrame("MyWindow");            //Creating a JFrame with name MyWindow
		JButton btn = new JButton("CLICK ME");//Creating a Button named Say Hello
		jf.add(btn);                            //adding button to frame
		jf.setLayout(new FlowLayout());        //setting layout using FlowLayout object
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //setting close  operation.
		jf.setSize(400, 400);                   //setting size
		jf.setVisible(true);                    //setting frame visibility
	}
	public static void main(String[] args)
	{
		new jbtn();
	}
}