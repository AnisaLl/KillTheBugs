package maininterface;

import java.awt.*;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class HelpView extends JPanel{

	//private JFrame frame;
	private JPanel panel;
	private final Dimension space = new Dimension(0,30);
	private JLabel logo;
	private Button backButton;
	private final String header = "HighScores";
	/**
	 * Launch the application.
	 */
	

	public HelpView() {
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
	
        
        add(Box.createRigidArea(space));

        JLabel lblHelp = new JLabel("Help",SwingConstants.CENTER);
        lblHelp.setFont(new Font("Circula", Font.PLAIN, 36));
        lblHelp.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblHelp);
        Component rigidArea = Box.createRigidArea(space);
        add(rigidArea);
        
        JLabel lblNewLabel_3 = new JLabel("By clicking new game you can join the world of bugs");
        lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_3);
        add(Box.createRigidArea(space));
        
        ImageIcon logo1 = new ImageIcon("/Users/MertGurcan/Desktop/CS319/mockup/main.png");
		Image image = logo1.getImage();
		Image newimg = image.getScaledInstance(120, 120,Image.SCALE_SMOOTH);
		logo1 = new ImageIcon(newimg);
		logo = new JLabel("",logo1,SwingConstants.CENTER);
		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel lblNewLabel = new JLabel("By clicking high scores you can see the one who is best ");
        lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel);
       
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_1 = new JLabel("By clicking Settings you can change the game or music volume ");
        lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_1);
        add(Box.createRigidArea(space));
        
        JLabel lblNewLabel_2 = new JLabel("By clicking credits, you can see the names of this game's developers");
        lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(lblNewLabel_2);
        add(Box.createRigidArea(space));

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
