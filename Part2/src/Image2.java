
import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
	public class Image2 extends JFrame {
		
JFrame frame;
	JLabel displayField;
	ImageIcon image;
	public Image2() {
		
	frame = new JFrame("Image Display");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	try{
		image = new ImageIcon(getClass().getResource("th.JFIF"));
		displayField = new JLabel(image);
		frame.add(displayField);
	   }catch(Exception e) {
		   System.out.println("Image cannot be found!");
	   }
	frame.pack();
	frame.setVisible(true);
	}

}

