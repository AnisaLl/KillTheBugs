package maininterface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;

public class MainMenuView extends JPanel{

	private JFrame frame;
	//private JPanel panel;
	private JLabel logo;
	private JLabel pageInfo;
	private final Dimension space = new Dimension(0,20);
        
	private Button newGameButton;
	private Button quitButton;
	private Button helpButton;
	private Button creditsButton;
	private Button settingsButton;
	private Button highScoreButton;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MainMenuView window = new MainMenuView();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public MainMenuView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		/////---path----///
		ImageIcon logo1 = new ImageIcon("pictures/Logofinal.png");
		Image image = logo1.getImage();
		Image newimg = image.getScaledInstance(120, 120,Image.SCALE_SMOOTH);
		logo1 = new ImageIcon(newimg);
		
		
		//panel = new JPanel();
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS) );
		this.setPreferredSize(new Dimension(550, 550));
		this.setBackground(new Color(191,167,77));
		
			
//		frame = new JFrame("Kill The Bugs");
//		frame.setSize(new Dimension(550, 550));
//		frame.getContentPane().add(panel, BorderLayout.NORTH);
//		frame.setVisible(true);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.setLocationRelativeTo(null);
//		frame.setResizable(false);
		
		logo = new JLabel("",logo1,SwingConstants.CENTER);
		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		pageInfo = new JLabel ("", SwingConstants.CENTER);
		pageInfo.setForeground(Color.white);
        pageInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        pageInfo.setText("");
        
        this.add(logo);
        this.add(pageInfo);
        this.add(Box.createRigidArea(space));
        this.add(newGameButton = new Button("New game", "src/pictures/newgamebutton.png"));
        this.add(Box.createRigidArea(space));
        this.add(highScoreButton = new Button("HighScore", "src/pictures/newgamebutton.png"));
//        mybutton_1.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		mybutton_1.addMouseListener(new MouseAdapter()
//        		{
//        			public void mouseClicked(MouseEvent m)
//        			{
//        				
//        				panel.removeAll();
//        				panel.updateUI();
//        			
//        				HighScoreView h= new HighScoreView();
//        				panel.add(h);
//        			}
//        		});
//        	}
//        });
        this.add(Box.createRigidArea(space));
        
        this.add(settingsButton = new Button("Settings", "src/pictures/newgamebutton.png"));
//        mybutton_2.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		mybutton_2.addMouseListener(new MouseAdapter()
//        		{
//        			public void mouseClicked(MouseEvent m)
//        			{
//        				
//        				panel.removeAll();
//        				panel.updateUI();
//        			
//        				SettingsView s= new SettingsView();
//        				panel.add(s);
//        					
//        				
//        			}
//        		});
//        	}
//        });
        
        this.add(Box.createRigidArea(space));
        this.add(creditsButton = new Button("Credits", "src/pictures/newgamebutton.png"));
//        mybutton_3.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		mybutton_3.addMouseListener(new MouseAdapter()
//        		{
//        			public void mouseClicked(MouseEvent m)
//        			{
//        				
//        				panel.removeAll();
//        				panel.updateUI();
//        			
//        				CreditsView s= new CreditsView();
//        				panel.add(s);
//        					
//        				
//        			}
//        		});
//        	}
//        });
        
        this.add(Box.createRigidArea(space));
        this.add(helpButton = new Button("Help", "src/pictures/newgamebutton.png"));
//        mybutton_4.addActionListener(new ActionListener() {
//        	public void actionPerformed(ActionEvent e) {
//        		mybutton_4.addMouseListener(new MouseAdapter()
//        		{
//        			public void mouseClicked(MouseEvent m)
//        			{
//        				
//        				panel.removeAll();
//        				panel.updateUI();
//        			
//        				HelpView s = new HelpView();
//        				panel.add(s);
//        					
//        				
//        			}
//        		});
//        	}
//        });
        this.add(Box.createRigidArea(space));
        this.add(quitButton = new Button("Quit", "src/pictures/newgamebutton.png"));
        this.updateUI();
		
	}

    public ArrayList<Button> getButtons() {
        ArrayList<Button> buttons = new ArrayList<Button>();
        buttons.add(getNewGameButton());
        buttons.add(getHighScoreButton());
        buttons.add(getSettingsButton());
        buttons.add(getCreditsButton());
        buttons.add(getHelpButton());
        buttons.add(getQuitButton());
        return buttons;
    }

    /**
     * @return the newGameButton
     */
    public Button getNewGameButton() {
        return newGameButton;
    }

    /**
     * @param newGameButton the newGameButton to set
     */
    public void setNewGameButton(Button newGameButton) {
        this.newGameButton = newGameButton;
    }

    /**
     * @return the quitButton
     */
    public Button getQuitButton() {
        return quitButton;
    }

    /**
     * @param quitButton the quitButton to set
     */
    public void setQuitButton(Button quitButton) {
        this.quitButton = quitButton;
    }

    /**
     * @return the helpButton
     */
    public Button getHelpButton() {
        return helpButton;
    }

    /**
     * @param helpButton the helpButton to set
     */
    public void setHelpButton(Button helpButton) {
        this.helpButton = helpButton;
    }

    /**
     * @return the creditsButton
     */
    public Button getCreditsButton() {
        return creditsButton;
    }

    /**
     * @param creditsButton the creditsButton to set
     */
    public void setCreditsButton(Button creditsButton) {
        this.creditsButton = creditsButton;
    }

    /**
     * @return the settingsButton
     */
    public Button getSettingsButton() {
        return settingsButton;
    }

    /**
     * @param settingsButton the settingsButton to set
     */
    public void setSettingsButton(Button settingsButton) {
        this.settingsButton = settingsButton;
    }

    /**
     * @return the highScoreButton
     */
    public Button getHighScoreButton() {
        return highScoreButton;
    }

    /**
     * @param highScoreButton the highScoreButton to set
     */
    public void setHighScoreButton(Button highScoreButton) {
        this.highScoreButton = highScoreButton;
    }

    
}
