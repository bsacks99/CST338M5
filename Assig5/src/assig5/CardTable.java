package assig5;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 *
 * GUI Cards - Bradley Sacks
 * CST338 - Professor Jesse Cecil,MS
 *
 */
public class CardTable extends JFrame {

    static int MAX_CARDS_PER_HAND = 56;
    static int MAX_PLAYERS = 2;  // for now, we only allow 2 person games

    private int numCardsPerHand;
    private int numPlayers;

    public JPanel pnlComputerHand, pnlHumanHand, pnlPlayArea;

    public CardTable(String title, int numCardsPerHand, int numPlayers) {
    }

    public int getNumCardsPerHand() {
        return numCardsPerHand;
    }

    public int getNumPlayers() {
        return numPlayers;
    }
    
}
