package mainInterface;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

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
	
	Button (Color c,String Label)
	{
		this.c=c;
		this.Label=Label;
		setText(Label);
		setBackground(c);
	}
	
	Button (String Label)
	{
		this.buttonimage=buttonimage;
		this.Label = Label;
		//------------------- need to define the path-----/////
		ImageIcon button1 = new ImageIcon("/Users/MertGurcan/Desktop/CS319/newgamebutton.png");
		Image image1 = button1.getImage();
		Image newimg1 = image1.getScaledInstance(160, 40,Image.SCALE_SMOOTH);
		button1 = new ImageIcon(newimg1);
		
		setBorder(BorderFactory.createEmptyBorder());
		setText(Label);
		setHorizontalTextPosition(JButton.CENTER);	
		setIcon((Icon) button1);
		
		setForeground(new Color(255, 255, 255));
		setFont(new Font("Circula", Font.PLAIN, 24));
		setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
	}
	
}
