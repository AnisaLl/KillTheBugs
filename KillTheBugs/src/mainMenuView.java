package mainInterface;

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

public class mainMenuView extends JPanel{

	private JFrame frame;
	private JPanel panel;
	private JLabel logo;
	private JLabel pageInfo;
	private final Dimension space = new Dimension(0,20);
	
	
	
	private Button mybutton;
	private Button mybutton_5;
	private Button mybutton_4;
	private Button mybutton_3;
	private Button mybutton_2;
	private Button mybutton_1;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainMenuView window = new mainMenuView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainMenuView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		/////---path----///
		ImageIcon logo1 = new ImageIcon("/Users/MertGurcan/Desktop/CS319/log/Logofinal.png");
		Image image = logo1.getImage();
		Image newimg = image.getScaledInstance(120, 120,Image.SCALE_SMOOTH);
		logo1 = new ImageIcon(newimg);
		
		
		panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS) );
		panel.setPreferredSize(new Dimension(550, 550));
		panel.setBackground(new Color(191,167,77));
		
			
		frame = new JFrame("Kill The Bugs");
		frame.setSize(new Dimension(550, 550));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
		logo = new JLabel("",logo1,SwingConstants.CENTER);
		logo.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		pageInfo = new JLabel ("", SwingConstants.CENTER);
		pageInfo.setForeground(Color.white);
        pageInfo.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        pageInfo.setText("");
        
        panel.add(logo);
        panel.add(pageInfo);
        panel.add(Box.createRigidArea(space));
        panel.add(mybutton = new Button("New game"));
        panel.add(Box.createRigidArea(space));
        panel.add(mybutton_1 = new Button("HighScore"));
        mybutton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mybutton_1.addMouseListener(new MouseAdapter()
        		{
        			public void mouseClicked(MouseEvent m)
        			{
        				
        				panel.removeAll();
        				panel.updateUI();
        			
        				highScoreView h= new highScoreView();
        				panel.add(h);
        			}
        		});
        	}
        });
        panel.add(Box.createRigidArea(space));
        
        panel.add(mybutton_2 = new Button("Settings"));
        mybutton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mybutton_2.addMouseListener(new MouseAdapter()
        		{
        			public void mouseClicked(MouseEvent m)
        			{
        				
        				panel.removeAll();
        				panel.updateUI();
        			
        				settingsView s= new settingsView();
        				panel.add(s);
        					
        				
        			}
        		});
        	}
        });
        
        panel.add(Box.createRigidArea(space));
        panel.add(mybutton_3 = new Button("Credits"));
        mybutton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mybutton_3.addMouseListener(new MouseAdapter()
        		{
        			public void mouseClicked(MouseEvent m)
        			{
        				
        				panel.removeAll();
        				panel.updateUI();
        			
        				creditsView s= new creditsView();
        				panel.add(s);
        					
        				
        			}
        		});
        	}
        });
        
        panel.add(Box.createRigidArea(space));
        panel.add(mybutton_4 = new Button("Help"));
        mybutton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mybutton_4.addMouseListener(new MouseAdapter()
        		{
        			public void mouseClicked(MouseEvent m)
        			{
        				
        				panel.removeAll();
        				panel.updateUI();
        			
        				helpView s= new helpView();
        				panel.add(s);
        					
        				
        			}
        		});
        	}
        });
        panel.add(Box.createRigidArea(space));
        panel.add(mybutton_5 = new Button("Quit"));
        panel.updateUI();
		
	}
}
