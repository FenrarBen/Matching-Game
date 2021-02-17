/*
 * Title: 	Greymageddon
 * Project:	Group 2 Project for CS 321
 * Authors: 	Tim Prishtina, Chris Parker, Gabriel Moore, Ben Strawbridge
 * Date:	11/19/2015
 * Instructor:	Daniel M Rochowiak
 * Disclaimer:	This program is entirely our own work.	
 */

/** custom_database package contains the Database.java class file. */
package custom_database;
import game_model.Card;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Database Class reads and writes to data folder using 4 methods. The four
 * methods are as follows.
 * <ul>
 * <li> readCards()    Receives the theme and passes it to the setImagePath method.
 * <li> setImagePath() Switches the image path based on the user theme selection.
 * <li> writeSave()    Writes the high score (lowest time) to a text file.
 * <li> readSave()     Reads the high score (lowest time) from a text file.
 * </ul>
 * <p>
 * Data folder contains: 
 * <ul>
 * <li> "256x256_retro_game_pngs" (folder) which contains "_nintendo_icons.txt" and 18 images.
 * <li> "256x256_animal_pngs" (folder) which contains "_animal_icons.txt" and 18 images.
 * <li> "high_score.txt"
 * </ul>
 * <p>
 * NOTE: The data folder *MUST* be moved into the dist folder after a clean 
 * and build .jar is created.
 * 
 * @author Gabriel Moore
 * @version 2.6.4
 */
public class Database
{
    public Card[] cards;  // array of cards
    String iconFile = ""; // folder path inside data folder
    String path = "";     // text file path inside folder path
    javax.swing.JFrame frame; // for dialog boxes in readSave and writeSave methods
    
    /** Database Class default constructor, creates a new array of cards. */
    public Database()
    {
        cards = new Card[18];
    }
    
    /**
     * readCards method reads in the theme, calls setImagePath method, and
     * passes the cards array and theme.
     * 
     * @param theme is the user selected theme of the card images.
     */
    public void readCards(String theme)
    {
        setImagePath(cards, theme);
    }
    
    /**
     * setImagePath sets the file path based on the theme selected by the user.
     * This method sets iconFile and path accordingly with two if statements,
     * and then populates the cards with images from the data folder.
     * 
     * @param cards is an array of card objects to have images attached in the try block.
     * @param theme is the user selected theme of the card images.
     */
    private void setImagePath(Card[] cards, String theme)
    {
        if (theme.equals("Retro Video Game Characters")) // if user selection
        {   // sets iconFile and path to proper directory in data folder
            iconFile = System.getProperty("user.dir") + File.separator + "data"
                       + File.separator + "256x256_retro_game_pngs";
            path = iconFile + File.separator + "_nintendo_icons.txt";
        }
        if (theme.equals("Animals")) // if user selection
        { // sets iconFile and path to proper directory in data folder
            iconFile = System.getProperty("user.dir") + File.separator + "data"
                       + File.separator + "256x256_animal_pngs";
            path = iconFile + File.separator + "_animal_icons.txt";
        }
        String iconFilename; // a string to hold the current image name in the text file
        BufferedReader readCardData; // buffered reader for reading image names in text file
        BufferedImage img; // img variable of BufferedImage type
        try
        {
            readCardData = new BufferedReader(new FileReader(path));
            for(int i=0;i<18;i++) // sets each image to each of the 18 elements
            {                     // in the card array
                iconFilename = readCardData.readLine(); // sets image name to current line in text file
                img = ImageIO.read(new File
                (iconFile + File.separator + iconFilename)); // gets the image for the buffered image
                cards[i] = new Card(i, img); // creates the card for the cards array
            }
        }
        catch(IOException e)
        {   // this error message is a little overboard, but i wanted to be thorough
            frame = new javax.swing.JFrame();   // new jframe for dialog box
            javax.swing.JOptionPane.showMessageDialog(frame, 
              "There was a problem reading from the database!\n"
            + "data folder must be inside dist folder with .jar file.\n"
            + "data folder must contain \"256x256_retro_game_pngs\" folder\n"
            + "and \"256x256_animal_pngs\" folder, each containing 18 images\n"
            + "and a file named \"_nintendo_icons.txt\" and \"_animal_icons.txt\"\n"
            + " respectively, with the name of each image on a new line.");
            
            System.exit(0); // exits after user presses OK or exits out of dialog box
        }
    }
    /**
     * writeSave method writes high scores to "high_score.txt" in the data 
     * folder. The high scores are written as 3 comma delimited strings.
     * They are written in the order: easyScore,intmScore,hardScore.
     * example: 8,29,215
     * 
     * @param size is the size of the game board.
     * @param winTime is the time elapsed after the user wins the game.
     */
    public void writeSave(int size, int winTime) 
    {
        String[] currentScores = readSave(); // creates a new array to hold the scores after readSave
        int easyScore = Integer.parseInt(currentScores[0]); // separates first score
        int intmScore = Integer.parseInt(currentScores[1]); // separates second score
        int hardScore = Integer.parseInt(currentScores[2]); // separates third score
        if (size == 4)  // for easy setting
        {
            if (easyScore > winTime)  // checks the time against the saved score
                easyScore = winTime;  // changes score if lower than saved score
        }
        else if (size == 8) // for intermediate setting
        {
            if (intmScore > winTime)  // checks the time against the saved score
                intmScore = winTime;  // changes score if lower than saved score
        }
        else if (size == 16)    // for hard setting
        {
            if (hardScore > winTime)  // checks the time against the saved score
                hardScore = winTime;  // changes score if lower than saved score
        }
        String easyStr = String.valueOf(easyScore); // converts easy int to string
        String intmStr = String.valueOf(intmScore); // converts intm int to string
        String hardStr = String.valueOf(hardScore); // converts hard int to string
        
        try 
        {   // try block sets high_score variable to path and writes scores
            File high_score = new File(System.getProperty("user.dir") // sets path
            + File.separator + "data" +File.separator + "high_score.txt");
            FileOutputStream is = new FileOutputStream(high_score); // creates or rewrites
            OutputStreamWriter osw = new OutputStreamWriter(is);    
            Writer w = new BufferedWriter(osw); // creates new buffered writer
            w.write(easyStr);   // writes easy score in string form
            w.write(",");       // writes comma
            w.write(intmStr);   // writes intermediate score in string form
            w.write(",");       // writes comma
            w.write(hardStr);   // writes hard score in string form
            w.close();          // closes the file
        } 
        catch (IOException e)
        { // exception never throws unless the path gets corrupted or removed at runtime  
            frame = new javax.swing.JFrame();
            javax.swing.JOptionPane.showMessageDialog(frame, 
            "There was a problem writing to \"high_score.txt\"!");
        }
    }
    /**
     * readSave method reads the high scores from "high_score.txt" in the data
     * folder. Uses a buffered reader to read the three comma delimited strings
     * from the text file into the three elements in the values array.
     * 
     * @return values returns the three strings.
     */
    public String[] readSave()
    {
        String[] values = null; // initializes values array to null
        try
        { // sets the path for the buffered reader and reads the comma delimited string
            BufferedReader br = new BufferedReader(new FileReader
            (System.getProperty("user.dir") + File.separator 
             + "data" +File.separator + "high_score.txt")); // path is set
            String line = null; // initializes line string to null
            while((line = br.readLine()) != null)   // reads the entire line
            {
              values = line.split(","); // sets the three comma delimited elements of the array
            }
            br.close(); // closes the file
        }
        catch (IOException e) 
        {  // exception never throws unless the path gets corrupted or removed at runtime
            frame = new javax.swing.JFrame();
            javax.swing.JOptionPane.showMessageDialog(frame, 
            "There was a problem reading from \"high_score.txt\"!");
        }
        return values; // returns the three element array of strings
    }
}