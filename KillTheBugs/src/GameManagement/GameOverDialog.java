
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameOverDialog extends JDialog implements ActionListener
	{

	// PROPERTIES
	private JLabel gameOverLabel;
	private JButton okButton;
	private JPanel body;
	private JPanel buttonPane;

	// CONSTRUCTOR
	public GameOverDialog() {
		gameOverLabel = new JLabel("Game Over");
		gameOverLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 24));
		gameOverLabel.setForeground(new Color(153, 0, 0));

		okButton = new JButton("OK");
		okButton.setBackground(new Color(153, 0, 0));
		okButton.setForeground(Color.WHITE);
		okButton.addActionListener(this);

		body = new JPanel(new GridLayout(3, 1));
		body.add(gameOverLabel);
		body.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));

		buttonPane = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		buttonPane.add(okButton);

		setLayout(new BorderLayout());
		add(buttonPane, BorderLayout.SOUTH);
		add(body, BorderLayout.CENTER);
		setTitle("New Clue");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - 540) / 2, (screenSize.height - 240) / 2,
				540, 240);
		setVisible(true);

	}

	// METHODS
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == okButton)
			dispose();
	}
}
