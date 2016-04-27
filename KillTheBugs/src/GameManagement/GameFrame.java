package GameManagement;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anisa
 */

public class GameFrame  extends JFrame {
    GameManager gameManager;
    public GameFrame()
    {
        super("Kill the Bugs");
        //gameManager = gameManager.getInstance();
        gameManager = new GameManager();
        gameManager.loadGame();
        setSize(new Dimension(550, 550));
        getContentPane().add(gameManager.getCardPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
