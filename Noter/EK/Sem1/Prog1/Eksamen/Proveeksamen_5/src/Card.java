public class Card {
    private final String suit;
    private final int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card OtherCard){
        if (this.value > OtherCard.value){
            return true;
        }
        if (this.value < OtherCard.value){
            return false;
        }
        return getSuitValue(this.suit) > getSuitValue(OtherCard.suit);
    }

    public int getSuitValue(String suit){
        switch (suit){
            case "hearts":
                return 4;
            case "diamonds":
                return 3;
            case "clubs":
                return 2;
            case "spades":
                return 1;
            default:
                return 0;
        }
    }

}
