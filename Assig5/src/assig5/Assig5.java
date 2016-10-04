/*
 *
 * GUI Cards - Bradley Sacks
 * CST338 - Professor Jesse Cecil,MS
 *
 */

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assig5 {
   // static for the 57 icons and their corresponding labels
    // normally we would not have a separate label for each card, but
    // if we want to display all at once using labels, we need to.

    static final int NUM_CARD_IMAGES = 57; // 52 + 4 jokers + 1 back-of-card image
    static Icon[] icon = new ImageIcon[NUM_CARD_IMAGES];
    static final String IMGPATH = "assets/images/";
    
    static char[] values = {'2','3','4','5', '6','7','8','9','T','J','Q','K','A','X'};
    static char[] suits = {'C','D','H','S'};;

    static void loadCardIcons() throws MalformedURLException {
        
        int counter = 0;
        
        for(int i=0; i < values.length; i++) {
            for(int j=0; j < suits.length; j++) {
                String desc = String.valueOf(values[i])  + String.valueOf(suits[j]);
                File image = new File(IMGPATH + desc + ".gif");
                
                icon[counter] = new ImageIcon(image.toURI().toURL(),desc);
                counter++;
            }
        }
        
        File image = new File(IMGPATH + "BK.gif");
        icon[counter] = new ImageIcon(image.toURI().toURL(),"BK");

    }

    // turns 0 - 13 into "A", "2", "3", ... "Q", "K", "X"
    static String turnIntIntoCardValue(int k) {
        try {
            return String.valueOf(values[k]);
        } catch(IndexOutOfBoundsException ex) {
            return null;
        }
    }

    // turns 0 - 3 into "C", "D", "H", "S"
    static String turnIntIntoCardSuit(int j) {
        try {
            return String.valueOf(suits[j]);
        } catch(IndexOutOfBoundsException ex) {
            return null;
        }
    }

    // a simple main to throw all the JLabels out there for the world to see
    public static void main(String[] args) {
        int k;

        try {
            // prepare the image icon array
            loadCardIcons();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Assig5.class.getName()).log(Level.SEVERE, null, ex);
        }

        // establish main frame in which program will run
        JFrame frmMyWindow = new JFrame("Card Room");
        frmMyWindow.setSize(1150, 650);
        frmMyWindow.setLocationRelativeTo(null);
        frmMyWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set up layout which will control placement of buttons, etc.
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 5, 20);
        frmMyWindow.setLayout(layout);

        // prepare the image label array
        JLabel[] labels = new JLabel[NUM_CARD_IMAGES];
        for (k = 0; k < NUM_CARD_IMAGES; k++) {
            labels[k] = new JLabel(icon[k]);
        }

        // place your 3 controls into frame
        for (k = 0; k < NUM_CARD_IMAGES; k++) {
            frmMyWindow.add(labels[k]);
        }

        // show everything to the user
        frmMyWindow.setVisible(true);
    }
}
