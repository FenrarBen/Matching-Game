/*
 * Title: 	Greymageddon
 * Project:	Group 2 Project for CS 321
 * Authors: 	Tim Prishtina, Chris Parker, Gabriel Moore, Ben Strawbridge
 * Date:	11/19/2015
 * Instructor:	Daniel M Rochowiak
 * Disclaimer:	This program is entirely our own work.	
 */

/** game_timer package contains the NTimer.java class file. */
package game_timer;

/**
 * Timer Class runs the game timer when created and started. This class will
 * run a timer counting up or down, depending on the parameters given the
 * constructor, and will run until the time given to the constructor.
 * 
 * @author Chris Parker
 * @version 2.6.4
 */
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import greymageddon.FrmMain;

/**
 * NTimer creates a counting timer to keep track of time elapsed.
 * 
 * @author Christopher
 */
public class NTimer implements ActionListener
{
    public int time = 0;
    private Timer timer;
    private int keyTime;
    private boolean isCountingUp = true;
    private boolean timeOver = false;
    
    /**
     * Constructs the NTimer class.
     * Sets the variables for the ending or starting time, depending on whether
     * the timer will be counting up or down, and creates the timer visual element
     * 
     * @param up is the boolean that decides the direction the timer will run.
     * @param kTime is the int value that tells when the timer will start (if 
     * counting down) or end (when counting up).
     */
    public NTimer(boolean up, int kTime)
    { //first argument is whether timer counts up
      //second argument is the starting time for the timer
        isCountingUp = up;
        if(isCountingUp)
        {
            keyTime = kTime;
        }
        else
        {
            time = kTime;
        }
        //create button here
        FrmMain.setLabel();
    }
    
    /**
     * actionPerformed method increments or decrements the timer. This method
     * is called by swing timer. If counting up the method increases the time 
     * variable by 1 when the swing timer calls and updates the timer visual 
     * element. If counting down, it decrements the time variable, updates the
     * visual element, and stops the timer if it has reached 0.
     * 
     * @param eve is the parameter used by the swing timer.
     */
    public void actionPerformed(ActionEvent eve)
    {
        if(isCountingUp)
        {
            time++;
            FrmMain.updateLabel(time);
        }
        else
        {
            time--;
            FrmMain.updateLabel(time);
            if(time <= keyTime)
            { //stops timer at 0
                timeOver = true;
                timer.stop();
            }
        }
    }
    
    /**
     * isTimeUp method returns a boolean indicating if the timer has reached its
     * end point. Returns true if the time is up, and false if
     * it has not yet reached the end point.
     * 
     * @return a boolean indicating if the timer has reached its end point.
     */
    public boolean isTimeUp()
    {
        return timeOver;
    }
    
    /**
     * startTimer method starts the timer. This method creates a swing timer 
     * that calls the action this class performs (update the time variable 
     * and timer visual element) and starts it.
     */
    public void startTimer()
    {
        timer = new Timer(1000, this);
        timer.start();
    }
    
    /** stopTimer method stops the timer. This method stops the swing timer 
     * started with the startTimer method.
     */
    public void stopTimer()
    {
        timer.stop();
    }
}
