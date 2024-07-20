import javax.swing.*; //importing swing package
import java.awt.*; //importing awt package
class imageii  
{
	JFrame jf;
	public imageii() 
                {
		jf = new JFrame("khushi's frame");     
	 
 	                 ImageIcon ii=new  ImageIcon("bihariji.PNG");
		JLabel lb = new JLabel(ii, JLabel.LEFT);
		jf.add(lb);                         
		 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setting close operation.
		jf.setSize(500,500);               
		 jf.setLocation(200,100);  
                                    jf.setBounds(300,70,500,800); 
                                  jf.setLayout(new FlowLayout());
                                        jf.setResizable(false);
                                   Container c=jf.getContentPane(); 
                                   c.setBackground(Color.pink); 
                                   jf.setVisible(true); 
	}
                  public static void main(String[] args)
                  {
                         new imageii();
                 }
}