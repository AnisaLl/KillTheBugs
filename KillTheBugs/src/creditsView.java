package mainInterface;

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class creditsView extends JPanel{

	//private JFrame frame;
	private JPanel panel;
	private final Dimension space = new Dimension(0,30);
	private Button mybutton;
	private final String header = "Credits";
	/**
	 * Launch the application.
	 */
	

	public creditsView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//panel = new JPanel();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS) );
		setPreferredSize(new Dimension(550, 550));
		setBackground(new Color(191,167,77));
        Component rigidArea = Box.createRigidArea(space);
        add(rigidArea);
	
        
       
        JLabel label = new JLabel(header,SwingConstants.CENTER);
        label.setFont(new Font("Circula", Font.PLAIN, 36));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(label);
   
       
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel = new JLabel("Authors:");
        lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
        lblNewLabel.setForeground(new Color(0, 0, 153));
        lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel);
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_1 = new JLabel("Anisa Llaveshi");
        lblNewLabel_1.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_1);
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_2 = new JLabel("C\u00FCneyt Erem");
        lblNewLabel_2.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_2);
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_3 = new JLabel("Ertun\u00E7 Efe");
        lblNewLabel_3.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_3);

        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_4 = new JLabel("Mert G\u00FCrcan");
        lblNewLabel_4.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_4);

        add(Box.createRigidArea(space));

		add(mybutton = new Button("Back"));
        mybutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mybutton.addMouseListener(new MouseAdapter()
        		{
        			public void mouseClicked(MouseEvent m)
        			{
						removeAll();
        				updateUI();
        				mainMenuView m1= new mainMenuView();
        				add(m1);
        			}
        		});
        	}
        });
        
       updateUI();
		
	}
}
