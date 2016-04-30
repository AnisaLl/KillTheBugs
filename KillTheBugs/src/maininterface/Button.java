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
import javax.swing.ImageIcon;
import javax.swing.JButton;
//?
public class Button extends JButton{

	String Label;
	String action;
	Color c;
	ActionListener listener;
	
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

                 try {
                     Image img = ImageIO.read(new FileInputStream(path));
                     img = img.getScaledInstance(60, 30, java.awt.Image.SCALE_SMOOTH);
                    this.setIcon(new ImageIcon(img));
                  } catch (IOException ex) {
                      ex.printStackTrace();
                }
		
		setBorder(BorderFactory.createEmptyBorder());
		setText(Label);
		setHorizontalTextPosition(JButton.CENTER);
                setPreferredSize(new Dimension (60, 30));
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
		setFont(new Font("Circula", Font.PLAIN, 15));
		setAlignmentX(Component.CENTER_ALIGNMENT);
		
		
	}
	
}
