package assig5;

import static assig5.main.IMGPATH;
import java.io.File;
import java.net.MalformedURLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 *
 * GUI Cards - Bradley Sacks
 * CST338 - Professor Jesse Cecil,MS
 *
 */
public class GUICard {

    private static Icon[][] iconCards = new ImageIcon[14][4]; // 14 = A thru K + joker
    private static Icon iconBack;
    static boolean iconsLoaded = false;

    static char[] values = {'2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A', 'X'};
    static char[] suits = {'C', 'D', 'H', 'S'};

    static void loadCardIcons() throws MalformedURLException {

        if (!iconsLoaded) {
            for (int i = 0; i < values.length; i++) {
                for (int j = 0; j < suits.length; j++) {
                    String desc = String.valueOf(values[i]) + String.valueOf(suits[j]);
                    File image = new File(IMGPATH + desc + ".gif");

                    iconCards[i][j] = new ImageIcon(image.toURI().toURL(), desc);
                }
            }

            File image = new File(IMGPATH + "BK.gif");
            iconBack = new ImageIcon(image.toURI().toURL(), "BK");

            iconsLoaded = true;
        }

    }

    static public Icon getIcon(Card card) {
        return iconCards[valueAsInt(card)][suitAsInt(card)];

    }

    private static int valueAsInt(Card card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static int suitAsInt(Card card) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    static public Icon getBackCardIcon() {
        return iconBack;
    }
}
