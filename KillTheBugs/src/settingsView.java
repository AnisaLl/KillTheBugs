package mainInterface;

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class settingsView extends JPanel{

	//private JFrame frame;
	private JPanel panel;
	private final Dimension space = new Dimension(0,30);
	private Button mybutton;
	private final String header = "HighScores";
	private final JLabel lblNewLabel = new JLabel("Game Volume");
	/**
	 * Launch the application.
	 */
	

	public settingsView() {
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
	
        
       
        JLabel label = new JLabel(header,SwingConstants.CENTER);
        label.setFont(new Font("Circula", Font.PLAIN, 36));
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(space));
        add(label);
        add(Box.createRigidArea(space));
        lblNewLabel.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel);
        
        JSlider slider = new JSlider();
        add(slider);
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_1 = new JLabel("Music Volume");
        lblNewLabel_1.setFont(new Font("Circula", Font.PLAIN, 18));
        lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_1);
        
        JSlider slider_1 = new JSlider();
        slider_1.setToolTipText("");
        add(slider_1);
        add(Box.createRigidArea(space));
        
        JRadioButton rdbtnNewRadioButton = new JRadioButton("Theme 1");
        rdbtnNewRadioButton.setFont(new Font("Circula", Font.PLAIN, 18));
        rdbtnNewRadioButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(rdbtnNewRadioButton);
        add(Box.createRigidArea(space));
        
        JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Theme 2");
        rdbtnNewRadioButton_1.setFont(new Font("Circula", Font.PLAIN, 18));
        rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnNewRadioButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(rdbtnNewRadioButton_1);

        add(Box.createRigidArea(space));
        
        JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Theme 3");
        rdbtnNewRadioButton_2.setFont(new Font("Circula", Font.PLAIN, 18));
        rdbtnNewRadioButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(rdbtnNewRadioButton_2);

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
