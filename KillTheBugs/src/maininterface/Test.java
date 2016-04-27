/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maininterface;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Anisa
 */
public class Test extends JPanel {
    JPanel javaProgrammingGame;
    JLabel label;

	// Constructor
	public Test() {
		setLayout(new BorderLayout());
		setBackground(new Color(153, 204, 255));

		// JPanel containing the java, progrmaming and game JLabels
		javaProgrammingGame = new JPanel();
                label = new JLabel("TEST");
                javaProgrammingGame.add(label);
		javaProgrammingGame.setLayout(new BoxLayout(javaProgrammingGame,
				BoxLayout.Y_AXIS));
		javaProgrammingGame.setBackground(new Color(153, 204, 255));
		javaProgrammingGame.setBorder(BorderFactory.createEmptyBorder(60, 10,
				10, 10));

		add(javaProgrammingGame, BorderLayout.CENTER);
	}
    
}
