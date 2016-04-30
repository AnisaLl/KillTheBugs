package GameManagement;

import java.awt.Dimension;
import javax.swing.JFrame;


public class GameFrame  extends JFrame {
    GameManager gameManager;
    public GameFrame()
    {
        super("Kill the Bugs");
        //gameManager = gameManager.getInstance();
        gameManager = new GameManager(this);
        gameManager.loadGame();
        setSize(new Dimension(800, 450));
        setResizable(false);
        getContentPane().add(gameManager.getCardPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(gameManager);
        setVisible(true);
    }
}
