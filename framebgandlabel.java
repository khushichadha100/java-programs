import javax.swing.*; //importing swing package
import java.awt.*; //importing awt package
class framebgandlabel  
{
	JFrame jf;
	public framebgandlabel() 
                {
		jf = new JFrame("khushi's frame");     
	 
 	                  
		JLabel lb = new JLabel("radhe radhe hare krishna");
		jf.add(lb);                         
		lb.setText("jai shri radhe");
                                   jf.add(lb);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation.
		jf.setSize(200,200);               
		    jf.setLayout(new FlowLayout()); 
            
                                   Container c=jf.getContentPane(); 
                                   c.setBackground(Color.pink); 
                                   jf.setVisible(true); 
	}
                  public static void main(String[] args)
                  {
                         new framebgandlabel();
                 }
}
	 