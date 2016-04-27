/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManagement;

import GE.Account;
import mainentities.User;
import MI.HighScoresView;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Ertunc EFE
 * ID: 21100426
 * Date: 21.04.2016
 */
public class FileManager {
    
    private User player;
    private ArrayList<User> data;
    private FileManager fileManager;
    private HighScoresView highScoresView;
    private final String fileName = "highScores.txt";
    
    
    private boolean isFileExists(){
        boolean result;
        File myFile = new File (fileName);
        
        return myFile.exists(); 
    }
    
    private ArrayList<User> readData(){
        
        ArrayList<User> returnData = new ArrayList<User>();
        
        if(isFileExists()){
            try{
                Scanner fileReader = new Scanner(new File(fileName));
                
                while(fileReader.hasNext()){
                    String lineInfo = fileReader.nextLine();
                    
                    Scanner takeUserData = new Scanner(lineInfo);
                    takeUserData.useDelimiter("/");
                    
                    String userName = takeUserData.next();
                    Account userScore = new Account(takeUserData.nextInt()); 
                    int userDuration = takeUserData.nextInt();
                    
                    returnData.add(new User(userName, userScore,userDuration));

                    
                    
                }
                
            }
            catch(Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"Kill The Bugs could not reach"
                                                +"the\ndata and process will be "
                                                + "terminated\n\t*Please contact Kill The Bugs team.");
                System.exit(0);
            }
        }
        else{
                JOptionPane.showMessageDialog(null,"Data file does not found in local memory.");
                returnData.clear();
        }
        
        return returnData;
    }
    
    private boolean writeData(){
        try
        {
            for(int i = 0 ; i<data.size();i++){
                FileWriter writer = new FileWriter(fileName,true); 
                BufferedWriter wrt = new BufferedWriter(writer);
                wrt.newLine();
                wrt.write(data.get(i).toString());
                wrt.close();
            }
            return true;
        }
        catch (Exception e)
        {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null,"Saving high score is unsuccessful");
              return false;  
        }
    }
    //taken from : http://courses.cs.washington.edu/courses/cse373/01wi/slides/Measurement/sld010.htm
    private void sortHighScores(){
        for(int i = 1 ; i<data.size();i++){
           User temp = data.get(i);
           int j;
           for(j = i-1; j>=0 && temp.getScore().getValue()<data.get(j).getScore().getValue(); j--){
               data.set(j+1, data.get(j));    
           }
           data.set(j+1,temp);
        }
    }
    
    
    private void addHighScore(User currentUser){
        data = this.readData();
        //first score will be the highest
        if(data.size() <= 10){
            data.add(currentUser);
            this.sortHighScores();
        }
        else if(currentUser.getScore().getValue() > data.get(data.size()-1).getScore().getValue())
        {
            data.remove(data.size()-1);
            data.add(data.size()-1,currentUser);
        }
        else
        {
            System.out.println("current user did not get a highscore"); 
        }
        
        
        data.add(currentUser);
        if(this.writeData())
            System.out.println("High scores have succesfully written.");
        else
            System.out.println("High scores could not saved");
    }
    
    public FileManager getInstance(User currentPlayer){
        
        fileManager.addHighScore(currentPlayer);
        fileManager = this;
        return fileManager;
    }
}
    

