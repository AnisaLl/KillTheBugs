/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GFI;
import GameMapUtility.GMActor;
import GameMapUtility.GMWorld;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import gamefieldentities.*;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;

/**
 *
 * @author USER
 */

public class FieldView extends JPanel{
	private BugView bugView;
	private CoinView coinView;
	private WeaponView weaponView;
	private GrenadeView grenadeView;
	private LaserGunView laserGunView;
	private BulletView bulletView;
        
        //private ArrayList<TileView> tileViewList;
        private GMActor[][] tileViewList;
        
        private int width, height;
        
        public FieldView(int width, int height)
        {
            this.setLayout(new GridLayout(width, height, 0, 0));
            tileViewList = new GMActor[width][height];
            this.width = width;
            this.height = height;
            
            for (int i = 0; i < width; i++)
            {
                for (int j = 0; j < height; j++)
                {
                    tileViewList[i][j] = new TileView();
                }
            }
;
            for (int i = 0; i < width; i++)
            {
                for (int j = 0; j < height; j++)
                {
                    this.add(tileViewList[i][j]);
                }
            }

        }

    /**
     * @return the tileViewList
     */
    public GMActor[][] getTileViewList() {
        return tileViewList;
    }

    /**
     * @param tileViewList the tileViewList to set
     */
    public void setTileViewList(GMActor[][] tileViewList) {
        this.tileViewList = tileViewList;
    }
    
    public void setTileViewListCoord(int x, int y, GMActor tileView)
    {
        removeAll();
        
        tileViewList[x][y] = tileView;
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                this.add(tileViewList[i][j]);
            }
        }
        repaint();
        revalidate();
    }

    public void addBug(GMActor bugView) {
        removeAll();
        tileViewList[1][14] = bugView;
        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                this.add(tileViewList[i][j]);
            }
        }
        repaint();
        revalidate();
    }

    
    
	
	
	
	
}