package GameManagement;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Anisa
 */

public class GameFrame  extends JFrame {
    
    private GameManager gameManager;

    public GameFrame()
    {
        super("Kill the Bugs");
        gameManager = gameManager.getInstance();
        gameManager.loadGame();
        setVisible(true);
    }
    

}
