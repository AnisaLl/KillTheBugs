package maininterface;

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class SettingsView extends JPanel{

	//private JFrame frame;
	private JPanel panel;
	private final Dimension space = new Dimension(0,30);
	private Button backButton;
	private final String header = "HighScores";
	private final JLabel lblNewLabel = new JLabel("Game Volume");
	/**
	 * Launch the application.
	 */
	

	public SettingsView() {
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

		add(backButton = new Button("Back"));
		 getBackButton().addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		getBackButton().addMouseListener(new MouseAdapter()
	        		{
	        			public void mouseClicked(MouseEvent m)
	        			{
							removeAll();
	        				updateUI();
	        				MainMenuView m1= new MainMenuView();
	        				add(m1);
	        			}
	        		});
	        	}
	        });
	        
       updateUI();
		
	}

    public Object getButtons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the backButton
     */
    public Button getBackButton() {
        return backButton;
    }

    /**
     * @param backButton the backButton to set
     */
    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }
}
