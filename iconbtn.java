import javax.swing.*;  //importing swing package
import javax.swing.*;  //importing swing package
import java.awt.*;     //importing awt package
public class iconbtn
{
	JFrame jf;
	public iconbtn() {
		jf = new JFrame("MyWindow");             
                                   ImageIcon ii=new ImageIcon("heart.JPG"); 
                                  JButton btn=new JButton(ii);

		 
		jf.add(btn);                            //adding button to frame
		jf.setLayout(new FlowLayout());        //setting layout using FlowLayout object
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      //setting close  operation.
		jf.setSize(400, 400);                   //setting size
		jf.setVisible(true);                    //setting frame visibility
	}
	public static void main(String[] args)
	{
		new iconbtn();
	}
}