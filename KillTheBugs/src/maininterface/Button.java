package maininterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//?
public class Button extends JButton{

	String Label;
	String action;
	Color c;
	ActionListener listener;
	private ImageIcon buttonimage;
	
	public Button (Color c,String Label)
	{
		this.c=c;
		this.Label=Label;
		setText(Label);
		setBackground(c);
	}
	
	public Button (String Label, String path)
	{
		this.Label = Label;
		//------------------- need to define the path-----/////
                
//		ImageIcon button1 = new ImageIcon("pictures/newgamebutton.png");
//		Image image1 = button1.getImage();
//		Image newimg1 = image1.getScaledInstance(160, 40,Image.SCALE_SMOOTH);
//		button1 = new ImageIcon(newimg1);

                 try {
                     Image img = ImageIO.read(new FileInputStream(path));
                     img = img.getScaledInstance(60, 30, java.awt.Image.SCALE_SMOOTH);
                    //Image img = ImageIO.read(this.getClass().getResource("src/pictures/newgamebutton.png"));
                    this.setIcon(new ImageIcon(img));
                  } catch (IOException ex) {
                      ex.printStackTrace();
                }
		
		setBorder(BorderFactory.createEmptyBorder());
		setText(Label);
		setHorizontalTextPosition(JButton.CENTER);
                setPreferredSize(new Dimension (60, 30));
		//setIcon((Icon) button1);
		
		//setForeground(new Color(255, 255, 255));
		setFont(new Font("Circula", Font.PLAIN, 15));
		setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
	}
        
        public Button (String Label)
	{
		this.Label = Label;
		setBorder(BorderFactory.createEmptyBorder());
		setText(Label);
		setHorizontalTextPosition(JButton.CENTER);
                setPreferredSize(new Dimension (60, 30));
		//setIcon((Icon) button1);
		
		//setForeground(new Color(255, 255, 255));
		setFont(new Font("Circula", Font.PLAIN, 15));
		setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
	}
	
}
