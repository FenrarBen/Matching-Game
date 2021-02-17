 /*
 * Title: 	Greymageddon
 * Project:	Group 2 Project for CS 321
 * Authors: 	Tim Prishtina, Chris Parker, Gabriel Moore, Ben Strawbridge
 * Date:	11/19/2015
 * Instructor:	Daniel M Rochowiak
 * Disclaimer:	This program is entirely our own work.	
 */

/** game_model package contains the Board.java and Card.java class files. */
package game_model;
import greymageddon.FrmMain;
import custom_database.Database;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Board Class creates the game and makes it playable. The constructor sets 
 * the size and theme, and calls methods to build the board and run the logic.
 * <ul>
 * <li> Board()          This is the constructor, sets the difficulty and theme.
 * <li> buildGameboard() Shuffles the cards and sets up the game on the GUI.
 * <li> scanBoard()      Runs the game logic and displays win and lose messages.
 * </ul>
 * 
 * @author Tim Prishtina
 * @version 2.6.4
 */
public class Board
{
    public Card[][] gameboard;//contains all Card objects needed for game to run
    private Database db = new Database();
    private int x, y, size;
    private int gameWinCondition = 0;
    public int gameLoseCondition = 10;
    private String boardsize;
    
    private ArrayList<Card> cardsforcompare = new ArrayList<Card>();
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JFrame frame;
    
    /**
     * Board Class constructor decides the parameters of the game board.
     * Constructor takes in 2 strings for the size of the game board and theme. 
     * Compares the size in three if statements and sizes the board accordingly.
     * Reads and sets the theme, then calls the buildGameBoard method.
     * 
     * @param board_size is the user selected difficulty of the game.
     * @param theme is the user selected theme of the card images.
     */
    public Board(String board_size, String theme)
    {
        boardsize = board_size;
        if (board_size.equals("4x2 Easy")) 
        {
            x = 2;
            y = 4;
            size = 4;
            gameboard = new Card[x][y];
            gameLoseCondition = 10;
        }
        else if (board_size.equals("4x4 Intermediate")) 
        {
            x = 4;
            y = 4;
            size = 8;
            gameboard = new Card[x][y];
            gameLoseCondition = 15;
        }
        else if (board_size.equals("6x6 Hard"))
        {
            x = 6;
            y = 6;
            size = 18;
            gameboard = new Card[x][y];
            gameLoseCondition = 30;
        }
        db.readCards(theme);
        buildGameboard(db.cards);
    }
    
    /**
     * buildGameboard method constructs the game and shuffles the cards.
     * This method initializes the cards randomly to the buttons of the GUI.
     * 
     * @param cards is an array of card objects from the Card class.
     */
    public void buildGameboard(Card[] cards)
    {
        int key = 0;
        int index = 0;
        int index2 = 0;
        ArrayList<Integer> sequentialkeys = new ArrayList<Integer>(size);
        ArrayList<Card> randomizedCards = new ArrayList<Card>(size*2);
        
        //this creates an arraylist of keys in order from 1 to 18
        for(int i=0; i<18; i++)
        {
            sequentialkeys.add(i, i);
        }
        //after sequentialkeys is populated we randomize these keys by shuffling
        Collections.shuffle(sequentialkeys);
        
        //here we populate an arraylist of card objects using the randomized keys
        //in sequentialkeys, this essentially creates a list of cards of size times 2
        //which is the amount of cards contained in the gameboard, initially the
        //arraylist will have sequential pairs of the same card.
        for (int i = 0; i < size*2; i++) 
        {
            key = sequentialkeys.get(index);
            randomizedCards.add(i, db.cards[key]);
            db.cards[key].cardCount--;
            if(db.cards[key].cardCount == 0)
            {
                index++;
            }
        }
        //we then shuffle the sequential randomizedCards to achieve actual
        //random pair placement inside randomizedCards.
        Collections.shuffle(randomizedCards);
        //finally we place every card in randomizedCards into the gameboard.
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                gameboard[i][j] = randomizedCards.get(index2);
                index2++;
            }
        }
    }
    
    /**
     * scanBoard method compares the the buttons clicked to see if they are
     * a match. This is the method that actually makes the game playable. It
     * also keeps track of the win and lose conditions and displays a dialog
     * box upon winning or losing.
     * 
     * @param x_coordinate is the x location of the array button.
     * @param y_coordinate is the y location of the array button.
     * @param button is each instance of the JButton on the GUI.
     */
    public void scanBoard(int x_coordinate, int y_coordinate, javax.swing.JButton button)
    {
        //putting thread to sleep for a second to give time to FrmMain to show
        //images on clicked buttons before performing other actions
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Board.class.getName()).log(Level.SEVERE, null, ex);
        }
        //tempicon is empty icon object used if buttons are not equal
        javax.swing.ImageIcon tempicon = new javax.swing.ImageIcon();
        cardsforcompare.add(gameboard[x_coordinate][y_coordinate]);
        boolean equal;
        
        //this checks if cardsforcompare is equal to 2, if it is not then this means
        //you only clicked one button so it will store that button and continue the game
        if (cardsforcompare.size() == 2) 
        {
            //if cardsforcompare is 2 then we set button2 equal to the passed in button
            //and set equal to the result of isEqual
            button2 = button;
            equal = cardsforcompare.get(0).isEqual(cardsforcompare.get(1));
            /*
            if equal is true and the buttons are not the same button clicked twice
            we disable both buttons and add 10 to gameWinCondition
            if equal isn't true and buttons are not the same we set the icons
            to tempicon to basically reset the button icons and we decrement
            gameLoseCondition by 1
            */
            if (equal == true && button1 != button2) 
            {
                button1.setEnabled(false);
                button2.setEnabled(false);
                gameWinCondition = gameWinCondition + 10;
            }
            else if(equal == false && button1 != button2)
            {
                button1.setIcon(tempicon);
                button2.setIcon(tempicon);
                gameLoseCondition--;
            }
            //if equal is true but its the same button clicked twice then we reset
            //buttons and do not penalize the player
            else if(equal == true && button1 == button2)
            {
                button1.setIcon(tempicon);
                button2.setIcon(tempicon);
            }
            cardsforcompare.clear();
        }
        else
        {
            button1 = button;
        }
        /*
        gameWinCondition corresponds to number of pairs of buttons matched times 10
        if playing on easy, then program looks for a gameWinCondition of 40, if
        playing intermediate then it looks for 80, if playing hard then 
        it looks for 180
        */
        if (   gameWinCondition ==  40 && boardsize.equals("4x2 Easy")
            || gameWinCondition ==  80 && boardsize.equals("4x4 Intermediate") 
            || gameWinCondition == 180 && boardsize.equals("6x6 Hard")) 
        {
            //if player has won then we get the time elapsed and call writeSave
            //in database class passing in the size of the board and winTime
            int winTime = FrmMain.getTime();
            db.writeSave(size, winTime);
            
            // This loop reads the correct High Score, based on size of the board
            String highScore = null;            // Declare variable to hold high score array
            String[] scores = db.readSave();    // Gets the three highscores in string array format
            if (size == 4)
            {
                highScore = scores[0];
            }
            else if (size == 8)
            {
                highScore = scores[1];
            }
            else if (size == 18)
            {
                highScore = scores[2];
            }
            //Finally we create a modal dialog to display a win message and stop the timer
            frame = new javax.swing.JFrame();
            FrmMain.endGameTimer();
            javax.swing.JOptionPane.showMessageDialog(frame,
            "<html><font color=green><font size = 18>You Win!!!</font></html>\n"
          + "<html><font color=red><font size = 18>Your Time: " + winTime + "</font></html>\n"
          + "<html><font color=blue><font size = 18>Best Time: " + highScore + "</font></html>");
        }
        if (gameLoseCondition <= 0) 
        {
            //if the player lost we give a lose message and restart the game
            frame = new javax.swing.JFrame();
            FrmMain.endGameTimer();           
            javax.swing.JOptionPane.showMessageDialog(frame,
            "<html><font color=red><font size = 18>Game Over!!!</font></html>\n"
          + "<html><font color=orange><font size = 18>:( :( :( :( :( :( :(\n"
          + "<html><font color=purple><font size = 18>Please Try Again.</font></html>");
            //the restart is done by programmatically clicking the restart button
            //this is done because of issues trying to call the restart() in FrmMain
            //directly so it was easier to click the restart button automatically
            FrmMain.btnRestart.doClick();
        }
    }
}
