
package assig5;

class Card { //Card Class By Chris

    public enum Suit {
        clubs, diamonds, hearts, spades
    }
    private char value;
    private Suit suit;
    boolean errorFlag;

    public static void main(String[] args) {
    }

    public Card(char value, Suit suit) {
        set(value, suit);
    }

    public Card() {
        this('A', Suit.spades);
    }

    public boolean set(char value, Suit suit) {
        if(!isValid(value, suit)) {
            setErrorFlag(true);
            return false;
        }
        setValue(value);
        setSuit(suit);
        return true;
    }

    public String toString() {
        if(getErrorFlag()) {
            return "** illegal **";
        }
        return value + "  of  " + suit;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public boolean getErrorFlag() {
        return errorFlag;
    }

    public void setErrorFlag(boolean errorFlag) {
        this.errorFlag = errorFlag;
    }

    public boolean equals(Card card) {
        return (card.getValue() == value && card.getSuit() == suit);
    }

    public boolean isValid(char value, Suit suit) {
        
        char[] values = new char[13];
        values[0] = 'A';
        values[1] = '2';
        values[2] = '3';
        values[3] = '4';
        values[4] = '5';
        values[5] = '6';
        values[6] = '7';
        values[7] = '8';
        values[8] = '9';
        values[9] = 'T';
        values[10] = 'J';
        values[11] = 'Q';
        values[12] = 'K';
        
        boolean valid = false;
        
        for(int i = 0; i < values.length; i++) {
            if(value == values[i] ) {
                valid = true;
                break;
            }
            valid = false;
        }    
        return valid;
    }

}