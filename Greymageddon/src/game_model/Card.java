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
import java.awt.image.BufferedImage;

/**
 * Card class holds variables for a unique card ID and image for each
 * card object. This class also contains the isEqual method which 
 * compares card IDs.
 * 
 * @author Ben Strawbridge
 * @version 2.6.4
 */
public class Card 
{
	private int ID;
        public int cardCount; // counts the number of times a card is used
	public BufferedImage pictureFile;//contains picture used by button
	
     /**
     * Card Class constructs a card object. Constructor takes an integer to 
     * identify the card and a buffered image for the button associated with
     * the card.
     * 
     * @param ID is the int used to identify the pair this card belongs to.
     * @param pictureFile is the BufferedImage that holds the image for the 
     * card's button.
     */
	public Card(int ID, BufferedImage pictureFile) 
        {
		this.ID = ID;
                this.cardCount = 2; // new counter to be decremented
		this.pictureFile = pictureFile;
	}

     /**
     * isEqual method compares the ID value in two card objects. This method 
     * takes a card object, compares this object's ID with that card's ID, 
     * returns true if they are equal, and false otherwise.
     * 
     * @param otherCard is the card object to be compared.
     * @return a boolean indicating whether the cards have the same ID.
     */
	public boolean isEqual(Card otherCard) 
        {
            if (this.ID == otherCard.ID) 
            {
                return true;
            }
            else 
            {
		return false;
            }
	}
}